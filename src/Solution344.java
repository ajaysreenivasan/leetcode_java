/*
 * Write a function that takes a string as input and returns the string reversed.
 * 	Example:
 *	Given s = "hello", return "olleh".
 * 
 */
public class Solution344 {
	public String reverseString(String s) {
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
			stringBuilder.append(s.charAt(i));
		}

		return stringBuilder.toString();
	}
}
