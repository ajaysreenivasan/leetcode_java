/*
 * Given an array of integers, every element appears twice except for one. Find that single one.

   Note:
	Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class Solution136 {
	public static void main(String[] args) {
		int[] input = { 4, 1, 4 };
		int result = singleNumber(input);
		System.out.println(result);
	}

	public static int singleNumber(int[] nums) {
		int result = nums[0];

		for (int i = 1; i < nums.length; i++) {
			result = result ^ nums[i];
		}

		return result;
	}
}
