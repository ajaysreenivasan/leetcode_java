
public class Solution204 {
    public static void main(String[] args) {
        System.out.println(countPrimes(1500000));
    }

    public static int countPrimes(int n) {
        int primeCount = 0;

        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        for (int i = 2; i < n; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeCount++;
            }
        }

        return primeCount;
    }
}
