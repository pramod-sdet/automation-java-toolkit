package strings;

//Find the length of the string without using the .length method

public class LengthOfStringWithToCharArray {

	public static void main(String[] args) {

		String data = "Hello";

		char characters[] = data.toCharArray();
		int count = 0;

		for (char x : characters) {

			count++;

		}

		System.out.println("length of string is :" + count);
	}

}
