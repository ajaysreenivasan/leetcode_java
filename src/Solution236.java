/*
 * Write a program to check whether a given number is an ugly number.
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 
 * For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
 * 
 * Note that 1 is typically treated as an ugly number.þ
 */

public class Solution236 {
	public static void main(String[] args) {
		System.out.println(isUgly(0));
	}

	public static boolean isUgly(int num) {
		boolean isUgly = true;

		if (num == 0) {
			return false;
		}

		while (num != 1) {
			if (num % 2 == 0) {
				num = num / 2;
				continue;
			} else if (num % 3 == 0) {
				num = num / 3;
				continue;
			} else if (num % 5 == 0) {
				num = num / 5;
				continue;
			} else {
				isUgly = false;
				break;
			}
		}

		return isUgly;
	}
}
