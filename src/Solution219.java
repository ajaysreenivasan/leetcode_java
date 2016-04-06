/*
 * Given an array of integers and an integer k, find out whether
 * there are two distinct indices i and j in the array such that
 * nums[i] = nums[j] and the difference between i and j is at most k.
 */
import java.util.HashSet;

public class Solution219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		boolean containsNearbyDuplicate = false;

		HashSet<Integer> window = new HashSet<>();
		int numsLength = nums.length;

		for (int i = 0; i < numsLength; i++) {
			if (!window.add(nums[i])) {
				containsNearbyDuplicate = true;
				break;
			}

			if (window.size() > k) {
				window.remove(nums[i - k]);
			}
		}

		return containsNearbyDuplicate;
	}
}
