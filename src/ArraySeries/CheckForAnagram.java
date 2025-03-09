import java.util.Arrays;

public class CheckForAnagram {

	/*
	Given two strings s1 and s2 consisting of lowercase characters, the task is to check whether the two given strings
	are anagrams of each other or not. An anagram of a string is another string that contains the same characters,
	only the order of characters can be different.
	 */

	private static void checkAnagram(String str, String str2) {

		char[] arr = str.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr2);

		System.out.println(Arrays.equals(arr, arr2));


	}

	public static void main(String[] args) {
		String str = "geeks";
		String str2 = "sgeek";
		checkAnagram(str,str2);
	}


}
