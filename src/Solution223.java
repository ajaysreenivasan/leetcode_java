/*
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 */

public class Solution223 {
	public static void main(String[] args) {
		// System.out.println(computeArea(-1500000001, 0, -1500000000, 1,
		// 1500000000, 0, 1500000001, 1));
	}

	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int totalArea = 0;

		long rectangleOneLength = C - A;
		long rectangleOneHeight = D - B;
		int rectangleOneArea = (int) (rectangleOneHeight * rectangleOneLength);

		long rectangleTwoLength = G - E;
		long rectangleTwoHeight = H - F;
		int rectangleTwoArea = (int) (rectangleTwoHeight * rectangleTwoLength);

		int overlapLength = calculateOverlap(A, C, E, G);
		int overlapHeight = calculateOverlap(B, D, F, H);
		int overlapArea = overlapHeight * overlapLength;

		totalArea = rectangleOneArea + rectangleTwoArea - overlapArea;

		return totalArea;
	}

	private int calculateOverlap(long v1Box1, long v2Box1, long v1Box2, long v2Box2) {
		long difference = (Math.min(v2Box1, v2Box2) - Math.max(v1Box1, v1Box2));

		return difference > 0 ? (int) difference : 0;
	}
}