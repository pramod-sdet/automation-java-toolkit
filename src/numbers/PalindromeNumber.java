package numbers;
/*
 * Program: Palindrome Number
 *
 * A number that reads the same forward and backward.
 *
 * Example:
 * 121 -> Palindrome
 * 123 -> Not Palindrome
 */

public class PalindromeNumber {

	public static void main(String[] args) {

        int number = 121;
        int original = number;
        int reversed = 0;

        while (number != 0) {

            int digit = number % 10;

            reversed = reversed * 10 + digit;

            number = number / 10;
        }

        if (original == reversed)
            System.out.println(original + " is Palindrome");
        else
            System.out.println(original + " is NOT Palindrome");
    }
}