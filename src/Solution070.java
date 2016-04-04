/*
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Solution: This is DP, but barely.
 */

public class Solution070 {
	int[] distinctWays;

	public int climbStairs(int n) {
		distinctWays = new int[n + 1];

		distinctWays[0] = 1;
		distinctWays[1] = 2;

		for (int i = 2; i < n; i++) {
			distinctWays[i] = distinctWays[i - 1] + distinctWays[i - 2];
		}

		return distinctWays[n - 1];
	}
}
