/*
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * 
 * Note:
 * 	You may assume that nums1 has enough space (size that is greater or equal to m + n)
 * 	to hold additional elements from nums2. The number of elements initialized in nums1
 * 	and nums2 are m and n respectively
 */

public class Solution088 {
	public static void main(String[] args) {

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int finalIndex = m + n - 1;
		int nums1Cursor = m - 1;
		int nums2Cursor = n - 1;

		while (finalIndex >= 0) {
			if (nums1Cursor < 0) {
				nums1[finalIndex] = nums2[nums2Cursor];
				nums2Cursor -= 1;
			} else if (nums2Cursor < 0) {
				nums1[finalIndex] = nums1[nums1Cursor];
				nums1Cursor -= 1;
			} else {
				if (nums1[nums1Cursor] > nums2[nums2Cursor]) {
					nums1[finalIndex] = nums1[nums1Cursor];
					nums1Cursor -= 1;
				} else if (nums1[nums1Cursor] < nums2[nums2Cursor]) {
					nums1[finalIndex] = nums2[nums2Cursor];
					nums2Cursor -= 1;
				} else {
					nums1[finalIndex] = nums1[nums1Cursor];
					nums1Cursor -= 1;
					finalIndex -= 1;
					nums1[finalIndex] = nums2[nums2Cursor];
					nums2Cursor -= 1;
				}
			}

			finalIndex -= 1;
		}
	}
}
