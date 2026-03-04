package numbers;

/*
 * Program: Prime Number Check
 * A prime number is a number greater than 1 that has no divisors
 * other than 1 and itself.
 *
 * Example:
 * 7 -> Prime
 * 8 -> Not Prime
 */
public class PrimeNumber {

	public static void main(String[] args) {


        int number = 17;
        boolean isPrime = true;

        // Prime numbers start from 2
        if (number <= 1) {
            isPrime = false;
        }

        // Check divisibility from 2 to number/2
        for (int i = 2; i <= number / 2; i++) {

            // If divisible by any number -> not prime
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(number + " is a Prime Number");
        else
            System.out.println(number + " is NOT a Prime Number");
    

	}

}
