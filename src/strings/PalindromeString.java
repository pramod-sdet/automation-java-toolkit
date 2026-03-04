package strings;

/*
 * Program: Check Palindrome String
 *
 * A string that reads the same forward and backward.
 *
 * Example:
 * madam -> Palindrome
 */
public class PalindromeString {

	public static void main(String[] args) {

        String input = "madam";

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equalsIgnoreCase(reversed))
            System.out.println(input + " is Palindrome");
        else
            System.out.println(input + " is NOT Palindrome");
    }
}