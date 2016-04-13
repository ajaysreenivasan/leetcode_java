
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
		System.out.println("la " + difference);
		return difference > 0 ? (int) difference : 0;
	}
	/*
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		  int xOverlapping = calcOverlap(A, C, E, G);
		  int yOverlapping = calcOverlap(B, D, F, H);
		  return (C - A) * (D - B) + (G - E) * (H - F) - xOverlapping * yOverlapping;
		}

		private int calcOverlap(long a1, long a2, long b1, long b2) {
		  long diff = (Math.min(a2, b2) - Math.max(a1, b1));
		  if (diff > 0) {
		    return (int) diff;
		  } else {
		    return 0;
		  }
		} */
}

