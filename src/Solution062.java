/*
 *
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time. 
 * The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * How many possible unique paths are there?
 *
 */
import java.util.Arrays;

public class Solution062 {
	public int uniquePaths(int m, int n) {
		int pathCount[][] = new int[m][n];

		Arrays.fill(pathCount, 0);

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i > 0 && j > 0) {
					pathCount[i][j] = pathCount[i - 1][j] + pathCount[i][j - 1];
				} else {
					if (i == 0 && j != 0) {
						pathCount[i][j] = pathCount[i][j - 1];
					} else if (i != 0 && j == 0) {
						pathCount[i][j] = pathCount[i - 1][j];
					} else {
						pathCount[i][j] = 1;
					}
				}
			}
		}

		return pathCount[m - 1][n - 1];
	}

	// Slightly faster version
	public int uniquePathsFaster(int m, int n) {
		int pathCount[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			pathCount[i][0] = 1;
		}

		for (int j = 0; j < n; j++) {
			pathCount[0][j] = 1;
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				pathCount[i][j] = pathCount[i - 1][j] + pathCount[i][j - 1];
			}
		}

		return pathCount[m - 1][n - 1];
	}
}
