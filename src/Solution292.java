/*
 * The counting game. 
 * If you start with a number divisible by four, you'll lose
 * 
 */
public class Solution292 {
	public boolean canWinNim(int n) {
		if (n % 4 == 0) {
			return false;
		} else {
			return true;
		}
	}
}
