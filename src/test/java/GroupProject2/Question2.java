package GroupProject2;
/*Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.*/

public class Question2 {
    public static void main(String[] args) {
        String word="detartrated";
        String reverse=(new StringBuilder(word)).reverse().toString();
        System.out.println(reverse);
        if (word.equals(reverse)){
            System.out.println(word+" is Palindrome");
        }else{
            System.out.println(word+" is not Palindrome");
        }

    }
}
