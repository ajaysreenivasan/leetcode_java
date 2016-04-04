/*
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class Solution027 {
	public int removeElement(int[] nums, int val) {
		int newLength = 0;
		int numsLength = nums.length;

		for (int i = 0; i < numsLength; i++) {
			if (nums[i] != val) {
				nums[newLength++] = nums[i];
				newLength += 1;
			}
		}

		return newLength;
	}
}
