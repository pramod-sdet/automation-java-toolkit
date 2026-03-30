package numbers;

/*
 * Program: Sum of Digits
 *
 * Example:
 * Input  = 123
 * Output = 6
 */

public class SumOfDigits {

	public static void main(String[] args) {
		 int number = 1234;
	        int sum = 0;

	        while (number != 0) {

	            int digit = number % 10;

	            sum = sum + digit;

	            number = number / 10;
	        }

	        System.out.println("Sum of digits = " + sum);
	    }
	}

//public class SumOfDigits {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter number: ");
//        int number = scanner.nextInt();
//
//        int sum = 0;
//
//        while (number != 0) {
//            sum += number % 10;
//            number /= 10;
//        }
//
//        System.out.println("Sum of digits: " + sum);
//        scanner.close();
//    }
//}