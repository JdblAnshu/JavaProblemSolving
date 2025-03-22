public class CheckForAnangramApp2 {
//Done
	private static void checkAnagramApp2(String str1, String str2) {

		int[] freq = new int[26];

		for(int i=0; i<str1.length(); i++){

			freq[str1.charAt(i) - 'a']++;
		}

		for(int i=0; i<str2.length(); i++){

			freq[str2.charAt(i) - 'a']--;
		}

		for(int e: freq){
			if(e!=0){
				System.out.println("Not anagram!!!!!");

				break;
			}
		}

	}

	public static void main(String[] args) {

		String str1 = "geekss";
		String str2 = "sgeek";
		checkAnagramApp2(str1,str2);
	}
}
