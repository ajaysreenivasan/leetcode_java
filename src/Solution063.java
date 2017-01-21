/*
 * Follow up for "Unique Paths":
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 */

public class Solution063 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int rowCount = obstacleGrid.length;
		int colCount = obstacleGrid[0].length;

		long[][] pathCount = new long[rowCount][colCount];

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				// pathCount[i][j] = 0;
			}
		}

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				if (obstacleGrid[i][j] == 1) {
					if (i > 0 && j > 0) {
						pathCount[i][j] = pathCount[i - 1][j] + pathCount[i][j - 1];
					} else {
						if (i == 0 && j == 0) {
							pathCount[i][j] = 1;
						} else if (i == 0 && j != 0) {
							pathCount[i][j] = pathCount[i][j - 1];
						} else if (i != 0 && j == 0) {
							pathCount[i][j] = pathCount[i - 1][j];
						}
					}
				}
			}
		}

		return (int) (pathCount[rowCount - 1][colCount - 1] % (Math.pow(10, 9) + 7));
	}
}
