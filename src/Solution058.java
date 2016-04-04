
public class Solution058 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {
        String[] wordList = s.split(" ");

        if (wordList.length > 0)
            return wordList[wordList.length - 1].length();
        else
            return 0;
    }
}
