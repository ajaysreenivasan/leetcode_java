import java.util.Scanner;

// Solution: Digital Root
public class Solution258 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();
		System.out.println(addDigits(input));

		scanner.close();
	}

	public static int addDigits(int num) {
		int digitalRoot = (int) (num - 9 * Math.floor((num - 1) / 9));

		return digitalRoot;
	}
}
