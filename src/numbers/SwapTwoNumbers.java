package numbers;
/*
 * Program: Swap Two Numbers
 *
 * Swap values of two variables without using a third variable.
 */
public class SwapTwoNumbers {

	public static void main(String[] args) {
		 int a = 10;
	        int b = 20;

	        System.out.println("Before Swap:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);

	        // Swap logic
	        a = a + b;
	        b = a - b;
	        a = a - b;

	        System.out.println("After Swap:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	    }
	}