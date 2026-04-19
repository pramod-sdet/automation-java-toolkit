package arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] ar = { 2, 4, 6, 8, 10, 12, 14 };

		int i = 0;
		int j = ar.length - 1;
		System.out.println("Original Arrays : " + Arrays.toString(ar));
		while (i < j) {

			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			i++;
			j--;

		}

		System.out.println("Reversed Arrays :" + (Arrays.toString(ar)));
	}

}
