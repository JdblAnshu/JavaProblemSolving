public class VowelAndConsonants {


	public static void main(String[] args) {
		//Check for vowel and consonants

		String str = "Hello, World!";
		str = str.toLowerCase();
		int vowelCount = 0;
		int consonantCount = 0;

		for(int i = 0; i< str.length();i++){
			char ch = str.charAt(i);

			if(ch == 'a' || ch == 'e'  || ch == 'i' || ch == 'o' ||ch == 'u' )
				vowelCount++;
			else if(ch >= 'a' && ch <= 'z')
				consonantCount++;

		}

		System.out.println(vowelCount);
		System.out.println(consonantCount);
	}
}
