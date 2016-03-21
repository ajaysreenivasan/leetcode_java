/*
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * For example:
 *  A -> 1
 *  B -> 2
 *  C -> 3
 *  ...
 *  Z -> 26
 *  AA -> 27
 *  AB -> 28
 *  
 *  Solution: Think about how you'd calculate the value for base 10. -_-
 */
public class Solution171 {
	public static void main(String[] args) {
		String input = "-_-";
		System.out.println(titleToNumber(input));
	}

    public static int titleToNumber(String s) {
        int sLength = s.length();
        int number = 0;
        
        for(int i = 0; i < sLength; i++){
            number += Math.pow(26, sLength - 1 - i) * ((int) s.charAt(i) - 64);
        }
        
        return number;
    }
}
