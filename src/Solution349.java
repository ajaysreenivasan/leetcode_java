import java.util.HashSet;

/*
 * Given two arrays, write a function to compute their intersection.
 * 
 * Example:
 *  Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 *  
 * Note:
 *  Each element in the result must be unique.
 *  The result can be in any order.
 */

public class Solution349 {
	public static void main(String[] args) {
		int[] nums1 = { 4, 7, 9, 7, 6, 7 };
		int[] nums2 = { 5, 0, 0, 6, 1, 6, 2, 2, 4 };

		int[] numsResult = intersection(nums1, nums2);
		for (int i = 0; i < numsResult.length; i++) {
			System.out.println(numsResult[i]);
		}
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> intersection = new HashSet<>();
		HashSet<Integer> result = new HashSet<>();

		for (int i = 0; i < nums1.length; i++) {
			intersection.add(nums1[i]);
		}

		for (int i = 0; i < nums2.length; i++) {
			if (intersection.contains(nums2[i])) {
				result.add(nums2[i]);
			}
		}

		int[] resultArray = new int[result.size()];
		int i = 0;
		for (Integer value : result) {
			resultArray[i] = value;
			i += 1;
		}

		return resultArray;
	}
}
