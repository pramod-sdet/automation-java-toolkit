package numbers;

/*
 * Program: Factorial
 *
 * Factorial of a number = n * (n-1) * (n-2) ... * 1
 *
 * Example:
 * 5! = 5 * 4 * 3 * 2 * 1 = 120
 */

public class Factorial {

	public static void main(String[] args) {

        int number = 5;
        int factorial = 1;

        // Multiply numbers from 1 to n
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " = " + factorial);
    }

	}


