package GroupProject2;
/*Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.*/

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        String word1="dusty";
        String word2="study";
        if (word1.length()==word2.length()) {
            char[] charArray1 = word1.toCharArray();
            char[] charArray2 = word2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean result = Arrays.equals(charArray1, charArray2);
            if (result) {
                System.out.println(word1 + " and " + word2 + " are anagram.");
            } else {
                System.out.println(word1 + " and " + word2 + " are not anagram.");
            }
        }
    }
}
