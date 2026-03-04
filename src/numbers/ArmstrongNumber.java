package numbers;
/*
 * Program: Armstrong Number
 *
 * An Armstrong number is a number where the sum of the cube
 * of its digits equals the number itself.
 *
 * Example:
 * 153 = 1³ + 5³ + 3³
 */

public class ArmstrongNumber {

	public static void main(String[] args) {

		int number = 153;
        int originalNumber = number;
        int result = 0;

        while (number != 0) {

            int digit = number % 10;

            result += digit * digit * digit;

            number = number / 10;
        }

        if (result == originalNumber)
            System.out.println(originalNumber + " is an Armstrong Number");
        else
            System.out.println(originalNumber + " is NOT an Armstrong Number");
    }
}