package numbers;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// Creating Scanner object to read input from keyboard
		Scanner scanner = new Scanner(System.in);
		// Asking user to enter first number
		System.out.println("Enter First Number: ");
		int num1 = scanner.nextInt(); // Reads first integer input and stores in num1

		System.out.println("Enter Second Number: "); // Asking user to enter second number
		int num2 = scanner.nextInt(); // Reads second integer input and stores in num2

		System.out.println("Enter Third Number: "); // Asking user to enter third number
		int num3 = scanner.nextInt(); // Reads third integer input and stores in num3

		int largest; // Declaring a variable to store the largest number

		if (num1 >= num2 && num1 >= num3) { // Check if num1 is greater than or equal to both num2 and num3
			largest = num1; // If true, num1 is the largest

		} else if (num2 >= num1 && num2 >= num3) { // If first condition is false, check if num2 is greater than or
													// equal to both num1 and num3
			largest = num2; // If true, num2 is the largest

		} else { // If both above conditions are false, then num3 must be the largest
			largest = num3; // Store num3 as largest
		}

		System.out.println("Largest Number is :" + largest);

		scanner.close();

	}
}