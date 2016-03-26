import java.util.HashSet;

/*
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process: 
 * 
 * Starting with any positive integer, replace the number by the 
 * sum of the squares of its digits, and repeat the process until 
 * the number equals 1 (where it will stay), or it loops endlessly 
 * in a cycle which does not include 1. 
 * 
 * Those numbers for which this process ends in 1 are happy numbers.
 */

public class Solution202 {
	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}

	public static boolean isHappy(int n) {
		boolean isHappy = false;
		HashSet<Integer> numberSet = new HashSet<>();

		int curNum = n;
		int newNum = 0;
		int curDigit = 0;
		while (numberSet.add(curNum)) {
			while (curNum != 0) {
				curDigit = curNum % 10;
				curNum = curNum / 10;

				newNum += curDigit * curDigit;
			}

			curNum = newNum;
			newNum = 0;

			if (curNum == 1) {
				isHappy = true;
				break;
			}
		}

		return isHappy;
	}
}
