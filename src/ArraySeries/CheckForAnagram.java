import java.util.Arrays;

public class CheckForAnagram {


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
