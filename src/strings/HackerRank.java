package strings;

import java.util.HashMap;

public class HackerRank {

    public static void main(String[] args) {

        String erica = "EHM";
        String bob = "HME";
        
        if(erica.length()!=bob.length()) {
        	
        	System.out.println("Length of erica and Bob should be same");
        }
        	

        HashMap<Character, Integer> scoreCard = new HashMap<>();

        scoreCard.put('E', 1);
        scoreCard.put('M', 3);
        scoreCard.put('H', 5);

        int ericaScore = 0;
        int bobScore = 0;

        for (int i = 0; i < erica.length(); i++) {

            char ericaPoint = erica.charAt(i);
            char bobPoint = bob.charAt(i);

            ericaScore += scoreCard.get(ericaPoint);
            bobScore += scoreCard.get(bobPoint);
        }

        if (ericaScore > bobScore) {
            System.out.println("Winner is Erica: " + ericaScore);
        } else if (ericaScore < bobScore) {
            System.out.println("Winner is Bob: " + bobScore);
        } else {
            System.out.println("It's a Tie");
        }
    }
}

/*
 * import java.util.*;

public class Solution {

    public static String winner(String erica, String bob) {

        Map<Character, Integer> scoreMap = new HashMap<>();
        scoreMap.put('E', 1);
        scoreMap.put('M', 3);
        scoreMap.put('H', 5);

        int ericaScore = 0;
        int bobScore = 0;

        int maxLength = Math.max(erica.length(), bob.length());

        for (int i = 0; i < maxLength; i++) {

            if (i < erica.length()) {
                ericaScore += scoreMap.get(erica.charAt(i));
            }

            if (i < bob.length()) {
                bobScore += scoreMap.get(bob.charAt(i));
            }
        }

        if (ericaScore > bobScore) return "Erica";
        else if (bobScore > ericaScore) return "Bob";
        else return "Tie";
    }
}
 */

/*import java.util.*;

public class Solution {

    public static String winner(String erica, String bob) {

        Map<Character, Integer> scoreMap = Map.of(
                'E', 1,
                'M', 3,
                'H', 5
        );

        int ericaScore = erica.chars()
                .map(c -> scoreMap.get((char) c))
                .sum();

        int bobScore = bob.chars()
                .map(c -> scoreMap.get((char) c))
                .sum();

        if (ericaScore > bobScore) return "Erica";
        else if (bobScore > ericaScore) return "Bob";
        else return "Tie";
    }
}
*/