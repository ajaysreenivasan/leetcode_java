import java.util.Collection;
import java.util.HashMap;

public class Solution242 {
    public static void main(String[] args) {
        System.out.println("Leedle");
        System.out.println(isAnagram("cat", "taco"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<String, Integer> characterCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String currentCharacter = "" + s.charAt(i);

            if (!characterCount.containsKey(currentCharacter)) {
                characterCount.put(currentCharacter, 1);
            }
            else {
                int currentCharacterCount = characterCount.get(currentCharacter);
                currentCharacterCount += 1;
                characterCount.put(currentCharacter, currentCharacterCount);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            String currentCharacter = "" + t.charAt(i);

            if (!characterCount.containsKey(currentCharacter)) {
                return false;
            }
            else {
                int currentCharacterCount = characterCount.get(currentCharacter);
                currentCharacterCount -= 1;
                characterCount.put(currentCharacter, currentCharacterCount);
            }
        }

        Collection<Integer> charCountCollection = characterCount.values();
        for (Integer i : charCountCollection) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
