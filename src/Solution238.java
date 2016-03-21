/*
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * 
 * Note:
 * - You must do this in-place without making a copy of the array.
 * - Minimize the total number of operations.
 * 
 */
public class Solution238 {
	public static void main(String[] args) {
		int[] input = { 0, 1, 0, 3, 12 };
		int contiguousIndex = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				input[contiguousIndex] = input[i];
				if (i != contiguousIndex) {
					input[i] = 0;
				}
				contiguousIndex += 1;
			}
		}

		print(input);
	}

	public static void print(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

		System.out.println();
	}
}
