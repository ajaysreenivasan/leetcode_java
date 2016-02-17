/*
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */

public class Solution191 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(3));
    }

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int hammingWeight = 0;

        String binaryString = Integer.toBinaryString(n);
        String[] binaryStringArray = binaryString.split("");
        
        for (int i = 0; i < binaryStringArray.length; i++) {
            if(binaryStringArray[i].equals("1"))
                hammingWeight++;
        }

        return hammingWeight;
    }
}
