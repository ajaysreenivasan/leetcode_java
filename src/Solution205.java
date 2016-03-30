
/*
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the 
 * same character but a character may map to itself.
 * 
 * For example,
 * 	Given "egg", "add", return true.
 * 	Given "foo", "bar", return false.
 * 	Given "paper", "title", return true.
 */

import java.util.HashMap;

public class Solution205 {
	public boolean isIsomorphic(String s, String t) {
		boolean isIsomorphic = true;

		if (s.length() != t.length()) {
			return false;
		}

		int stringLength = s.length();

		HashMap<Character, Character> charMapST = new HashMap<>();
		HashMap<Character, Character> charMapTS = new HashMap<>();

		for (int i = 0; i < stringLength; i++) {
			if (!charMapST.containsKey(s.charAt(i))) {
				charMapST.put(s.charAt(i), t.charAt(i));
			} else {
				if (!charMapST.get(s.charAt(i)).equals(t.charAt(i))) {
					isIsomorphic = false;
					break;
				}
			}

			if (!charMapTS.containsKey(t.charAt(i))) {
				charMapTS.put(t.charAt(i), s.charAt(i));
			} else {
				if (!charMapTS.get(t.charAt(i)).equals(s.charAt(i))) {
					isIsomorphic = false;
					break;
				}
			}
		}

		return isIsomorphic;
	}
}
