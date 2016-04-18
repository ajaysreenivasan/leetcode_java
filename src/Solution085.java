/*
 * Given a 2D binary matrix filled with 0's and 1's, 
 * find the largest rectangle containing all ones and return its area.
 */
public class Solution085 {
	public static void main(String[] args) {
		char[][] input = { { '1','0','1','0','0' }, { '1','0','1','1','1' }, { '1','1','1','1','1' }, { '1','0','0','1','0' } };
		System.out.println(maximalRectangle(input));
	}

	public static int maximalRectangle(char[][] matrix) {
		int maximalRectangleArea = 0;
		int rectangleRowCount = 0;
		int rectangleColCount = 0;

		if (matrix != null) {
			rectangleRowCount = matrix.length;
			if (rectangleRowCount > 0) {
				rectangleColCount = matrix[0].length;
			}

			for (int i = 0; i < rectangleRowCount; i++) {
				for (int j = 0; j < rectangleColCount; j++) {
					if (matrix[i][j] == '1') {
						int rectangleRowLength = 0;
						int rectangleColLength = 0;
						int rowCursor = i;
						int colCursor = j;

						while (colCursor < rectangleColCount) {
							if (matrix[i][colCursor] != '1') {
								break;
							}

							rectangleColLength += 1;
							colCursor += 1;
						}

						while (rowCursor < rectangleRowCount) {
							if (matrix[rowCursor][j] != '1') {
								break;
							}

							rectangleRowLength += 1;
							rowCursor += 1;
						}

						int rectangleArea = rectangleRowLength * rectangleColLength;
						System.out.println(i + " " + j + " " + rectangleArea + " " + rectangleColLength + " " + rectangleRowLength);
						if (rectangleArea > maximalRectangleArea) {
							maximalRectangleArea = rectangleArea;
						}

						j = colCursor;
					}
				}
			}
		}

		return maximalRectangleArea;
	}
}
