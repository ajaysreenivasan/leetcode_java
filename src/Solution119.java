/*
 * Given an index k, return the kth row of the Pascal's triangle.
 * 
 * For example, given k = 3,
 * 	Return [1,3,3,1].
 * 
 * Note:
 * 	Could you optimize your algorithm to use only O(k) extra space?
 */

import java.util.ArrayList;
import java.util.List;

public class Solution119 {
	public static void main(String[] args) {
		List<Integer> list = getRow(0);

		printList(list);
	}

	public static List<Integer> getRow(int rowIndex) {
		List<Integer> newRow = new ArrayList<>();

		List<Integer> previousRow = null;

		for (int i = 0; i <= rowIndex; i++) {
			newRow = new ArrayList<>();

			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					newRow.add(1);
				} else {
					newRow.add(previousRow.get(j - 1) + previousRow.get(j));
				}
			}

			previousRow = newRow;

		}

		return newRow;

	}

	private static void printList(List<Integer> list) {
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

}
