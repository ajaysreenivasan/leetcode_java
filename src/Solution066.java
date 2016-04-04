import java.util.ArrayList;

public class Solution066 {
    public static void main(String[] args) {
        int[] newVal = plusOne(new int[] { 9, 9 });

        for (int i = 0; i < newVal.length; i++) {
            System.out.print(newVal[i]);
        }
        System.out.println("");
    }

    // iterative and messy -_-
    public static int[] plusOne(int[] digits) {
        int numLength = digits.length;

        if (digits[numLength - 1] < 9) {
            digits[numLength - 1] += 1;
            return digits;
        }

        boolean hasCarry = false;

        for (int i = numLength - 1; i >= -1; i--) {
            if (!hasCarry) {
                if (digits[i] < 9) {
                    digits[i] += 1;
                    return digits;
                }

                digits[i] = 0;
                hasCarry = true;
            }
            else {
                if (i == -1) {
                    int[] newNumber = new int[numLength + 1];

                    for (int j = 0; j < numLength; j++) {
                        newNumber[j + 1] = digits[j];
                    }
                    newNumber[0] = 1;

                    return newNumber;
                }
                else {
                    if (digits[i] < 9) {
                        digits[i] += 1;
                        hasCarry = false;
                        return digits;
                    }
                    else {
                        digits[i] = 0;
                        hasCarry = true;
                    }
                }
            }
        }

        return digits;
    }

    // Iterative

    // Recursive
    /*
     * public static int[] plusOne(int[] digits) { return addOne(digits, digits.length - 1); }
     */

    public static int[] addOne(int[] digits, int index) {
        int numLength = digits.length;

        if (index == -1) {
            int[] newNumber = new int[digits.length + 1];

            newNumber[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                newNumber[i + 1] = digits[i];
            }

            return newNumber;
        }

        if (digits[index] < 9) {
            digits[index] += 1;
            return digits;
        }
        else {
            digits[index] = 0;
            return addOne(digits, index - 1);
        }
    }
}
