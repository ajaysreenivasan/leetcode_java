/*
 * Given an integer n, return the number of trailing zeroes in n!.
 * Note: Your solution should be in logarithmic time complexity.
 * 
 * http://www.purplemath.com/modules/factzero.htm
 */
public class Solution172 {
	public static void main(String[] args) {
		System.out.println(trailingZeroes(2147483647));
	}

	public static int trailingZeroes(int n) {
		int zeroCount = 0;

		while (n > 0) {
			n /= 5;
			zeroCount += n;
		}

		return zeroCount;
	}
}
