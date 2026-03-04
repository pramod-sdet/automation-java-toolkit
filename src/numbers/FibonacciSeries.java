package numbers;

/*
 * Program: Fibonacci Series
 *
 * Each number is the sum of previous two numbers.
 *
 * Example:
 * 0 1 1 2 3 5 8 13
 */


public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10;

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;

            // Move numbers forward
            first = second;
            second = next;
        }
    }
}