
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
		int stringLength = s.length();

		HashMap<Character, Character> charMap = new HashMap<>();

		for (int i = 0; i < stringLength; i++) {
			if (!charMap.containsKey(s.charAt(i))) {
				charMap.put(s.charAt(i), t.charAt(i));
			} else {
				if (!charMap.get(s.charAt(i)).equals(t.charAt(i))) {
					isIsomorphic = false;
					break;
				}
			}
		}

		charMap.clear();

		for (int i = 0; i < stringLength; i++) {
			if (!charMap.containsKey(t.charAt(i))) {
				charMap.put(t.charAt(i), s.charAt(i));
			} else {
				if (!charMap.get(t.charAt(i)).equals(s.charAt(i))) {
					isIsomorphic = false;
					break;
				}
			}
		}

		return isIsomorphic;
	}
}
