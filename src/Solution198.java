/*
 * You are a professional robber planning to rob houses along a street. 
 * Each house has a certain amount of money stashed, the only constraint 
 * stopping you from robbing each of them is that adjacent houses 
 * have security system connected and it will automatically contact 
 * the police if two adjacent houses were broken into on the same night.
 * 
 * Given a list of non-negative integers representing the amount of money of each house, 
 * determine the maximum amount of money you can rob tonight without alerting the police.
*/

public class Solution198 {
	public int rob(int[] nums) {
		int numsLength = nums.length;
		int sum[] = new int[numsLength];
		int maxMoney = 0;

        if(nums == null || numsLength == 0){
            return 0;
        }

		if (numsLength == 1) {
			maxMoney = nums[0];
		} else if (numsLength == 2) {
			maxMoney = Math.max(nums[0], nums[1]);
		} else {
		    sum[0] = nums[0];
		    sum[1] = Math.max(nums[0], nums[1]);
		    
			for (int i = 2; i < numsLength; i++) {
				sum[i] = Math.max(sum[i - 2] + nums[i], sum[i - 1]);

				if (maxMoney < sum[i]) {
					maxMoney = sum[i];
				}
			}
		}

		return maxMoney;
	}
}