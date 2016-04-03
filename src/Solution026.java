/*
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * 
 * For example,
 * 	Given input array nums = [1,1,2],
 * 	Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. 
 * 	It doesn't matter what you leave beyond the new length.
 */

public class Solution26 {
	public int removeDuplicates(int[] nums) {
		int uniqueCount = 0;
		int numsLength = nums.length;

		if (numsLength > 0) {
			uniqueCount += 1;
			int lastUnique = nums[0];

			for (int i = 0; i < numsLength; i++) {
				if (nums[i] != lastUnique) {
					nums[uniqueCount] = nums[i];
					uniqueCount += 1;
					lastUnique = nums[i];
				}
			}
		}

		return uniqueCount;
	}
}
