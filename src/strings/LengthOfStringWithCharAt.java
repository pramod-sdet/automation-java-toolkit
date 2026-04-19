package strings;

public class LengthOfStringWithCharAt {

	public static void main(String[] args) {

		String data = "Hello World";
		System.out.println("length of string is :" + data.length());

		int count = 0;

		while (true) {

			try {

				data.charAt(count);
				count++;

			} catch (StringIndexOutOfBoundsException e) {
				System.out.println(count);
				break;

			}

		}

	}
}
