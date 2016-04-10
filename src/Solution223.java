
public class Solution223 {
	public static void main(String[] args) {
		System.out.println(computeArea(-1500000001, 0, -1500000000, 1, 1500000000, 0, 1500000001, 1));
	}

	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int totalArea = 0;

		long rectangleOneHeight = C - A;
		long rectangleOneLength = D - B;
		int rectangleOneArea = (int) (rectangleOneHeight * rectangleOneLength);

		long rectangleTwoHeight = G - E;
		long rectangleTwoLength = H - F;
		int rectangleTwoArea = (int) (rectangleTwoHeight * rectangleTwoLength);

		int overlapHeight = calculateOverlap(A, C, E, G);
		int overlapLength = calculateOverlap(B, D, F, H);
		int overlapArea = overlapHeight * overlapLength;

		totalArea = rectangleOneArea + rectangleTwoArea - overlapArea;

		return totalArea;
	}

	private static int calculateOverlap(int a, int b, int c, int d) {
		long difference = (Math.min(d, b) - Math.max(c, a));

		return difference > 0 ? (int) difference : 0;
	}
}
