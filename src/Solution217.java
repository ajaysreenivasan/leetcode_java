import java.util.HashSet;

/*
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class Solution217 {
	public static void main(String[] args) {

	}

	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> intSet = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (!intSet.add(nums[i])) {
				return true;
			}
		}

		return false;
	}
}
