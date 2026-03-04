package numbers;

/*
 * Program: Even or Odd Check
 *
 * A number is:
 * Even -> divisible by 2
 * Odd  -> not divisible by 2
 */
public class EvenOddCheck {

	public static void main(String[] args) {

        int number = 15;

        if (number % 2 == 0)
            System.out.println(number + " is EVEN");
        else
            System.out.println(number + " is ODD");
    }
}