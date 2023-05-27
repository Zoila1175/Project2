package GroupProject2;
/*Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.*/

public class Question5 {
    public static void main(String[] args) {
        String str = "Minuscule";
        boolean word = true;
        for (char i : str.toCharArray()) {
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                System.out.println("The first non-repeating character is " + i);
                word = false;
                break;
            }
        }
        if (word) {
            System.out.println("There is no non-repeating characters.");

        }
    }
}


