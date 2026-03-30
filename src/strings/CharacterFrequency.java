package strings;

import java.util.HashMap;

public class CharacterFrequency {

	public static void main(String[] args) {
		String str = "hello";

		// Create a HashMap to store character and its count
		HashMap<Character, Integer> map = new HashMap<>();

		// Loop through each character of the string
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			// If character already exists in map, increase count
			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);
			}
			
			 // Otherwise add character with count 1
				else {
					map.put(ch, 1);
				}

			}
	      // Print character frequencies
		 System.out.println("Character Frequencies:");
		    for (char key : map.keySet()) {
		    	System.out.println(key + " = " + map.get(key));
		    }

		}

	}