import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/*
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.'
 * 
 * Note: You may assume the string contain only lowercase letters.
 * 
 */

public class Solution387 {
	public int firstUniqChar(String s) {
		int firstUniqueCharIndex = -1;

		Queue<Character> encounterOrder = new LinkedList<>();
		Map<Character, Integer> characterCount = new HashMap<>();
		char curChar;

		for (int i = 0; i < s.length(); i++) {
			curChar = s.charAt(i);
			if (!characterCount.containsKey(curChar)) {
				characterCount.put(curChar, 0);
				encounterOrder.add(curChar);
			}

			characterCount.put(curChar, characterCount.get(curChar) + 1);
		}

		for (Character c : encounterOrder) {
			if (characterCount.get(c) == 1) {
				firstUniqueCharIndex = s.indexOf(c);
				break;
			}
		}

		return firstUniqueCharIndex;
	}
}
