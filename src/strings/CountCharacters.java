package strings;
/*
 * Program: Count Character Frequency
 *
 * Example:
 * automation
 *
 * a=2
 * u=1
 * t=2
 */

import java.util.HashMap;

public class CountCharacters {

	public static void main(String[] args) {
		 String input = "automation";

	        HashMap<Character, Integer> map = new HashMap<>();

	        for (char c : input.toCharArray()) {

	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        System.out.println(map);
	    }
	}