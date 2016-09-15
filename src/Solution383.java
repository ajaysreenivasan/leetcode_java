import java.util.HashMap;

/*
 * Given an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines,  write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;  otherwise,  it  will  return  false.   
 * Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.
 * 
 * Note:
 *  You may assume that both strings contain only lowercase letters.
 */

public class Solution383 {
	public boolean canConstruct(String ransomNote, String magazine) {
		boolean canConstruct = true;
		HashMap<Character, Integer> characterCount = new HashMap<>();
		char curChar;
		
		for (int i = 0; i < magazine.length(); i++) {
			curChar = magazine.charAt(i);

			if (!characterCount.containsKey(curChar)) {
				characterCount.put(curChar, 0);
			}

			characterCount.put(curChar, characterCount.get(curChar) + 1);
		}

		for (int i = 0; i < ransomNote.length(); i++) {
			curChar = ransomNote.charAt(i);

			if (!characterCount.containsKey(curChar)) {
				canConstruct = false;
				break;
			}

			characterCount.put(curChar, characterCount.get(curChar) - 1);
			if (characterCount.get(curChar) == 0) {
				characterCount.remove(curChar);
			}
		}

		return canConstruct;
	}
}
