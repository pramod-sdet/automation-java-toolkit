package strings;

import java.util.List;
import java.util.Arrays;

public class MaxStreakProblem {

	public static void main(String[] args) {

		List<String> weekLogs = Arrays.asList("YYY", "YNY", "YYY", "YYY");
		calaculateMaxStreak(weekLogs);

	}

	private static void calaculateMaxStreak(List<String> weekLogs) {

		int currentStreak = 0;
		int maxStreak = 0;
		for (String data : weekLogs) {

			System.out.println(data);
		}

	}

}
