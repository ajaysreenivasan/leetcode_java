
/*
 * Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.

Examples: 
[2,3,4] , the median is 3

[2,3], the median is (2 + 3) / 2 = 2.5

Design a data structure that supports the following two operations:

void addNum(int num) - Add a integer number from the data stream to the data structure.
double findMedian() - Return the median of all elements so far.
 */

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution295 {
	PriorityQueue<Integer> smallerElements;
	PriorityQueue<Integer> largerElements;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Solution295 medianFinder = new Solution295();

		int value;
		while (scanner.hasNext()) {
			value = scanner.nextInt();
			medianFinder.addElement(value);
			medianFinder.printQueues();
			System.out.println(medianFinder.getMedian());
		}

		scanner.close();
	}

	public Solution295() {
		smallerElements = new PriorityQueue<>(Comparator.reverseOrder());
		largerElements = new PriorityQueue<>();
	}

	public void addElement(int value) {
		largerElements.add(value);

		if (smallerElements.size() > 0 && largerElements.size() > 0) {
			while (smallerElements.peek() > largerElements.peek()) {
				largerElements.add(smallerElements.poll());
				smallerElements.add(largerElements.poll());
			}
		}

		while ((Math.abs(smallerElements.size() - largerElements.size()) > 1)) {
			if (smallerElements.size() > largerElements.size()) {
				largerElements.add(smallerElements.poll());
			} else {
				smallerElements.add(largerElements.poll());
			}
		}
	}

	public double getMedian() {
		if (smallerElements.size() == largerElements.size()) {
			return (smallerElements.peek() + largerElements.peek()) / 2.0;
		} else {
			return largerElements.peek();
		}
	}

	public void printQueues() {
		System.out.println("--------QUEUES--------");
		for (Integer i : smallerElements) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		System.out.println("----");
		for (Integer i : largerElements) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		System.out.println("----------------------");
	}
}
