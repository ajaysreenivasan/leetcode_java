/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * 
 * For example,
 * 	"A man, a plan, a canal: Panama" is a palindrome.
 * 	"race a car" is not a palindrome
 */
public class Solution125 {
	public static void main(String[] args) {
		boolean a = isPalindrome("A man, a plan, a canal: Panama");
		System.out.println(a);
	}

	public static boolean isPalindrome(String s) {
		boolean isPalindrome = true;

		String filteredString = s;
		filteredString = s.replaceAll("[^A-Za-z0-9]", "");
		filteredString = filteredString.toLowerCase();
		int stringLength = filteredString.length() - 1;

		if (stringLength > 0) {
			for (int i = 0; i <= stringLength / 2; i++) {
//				System.out.println(filteredString.charAt(i) + ", " + filteredString.charAt(stringLength - i));
				if (filteredString.charAt(i) != filteredString.charAt(stringLength - i)) {
					isPalindrome = false;
					break;
				}
			}
		}

		return isPalindrome;
	}
}
