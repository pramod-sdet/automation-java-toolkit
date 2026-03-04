package strings;

import java.util.Arrays;

/*
 * Program: Check Anagram
 *
 * Two strings are anagrams if they contain the same characters.
 *
 * Example:
 * listen -> silent
 */
public class AnagramCheck {

	public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2))
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are NOT Anagrams");
    }
}