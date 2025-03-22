import java.util.HashSet;
import java.util.Set;
//Done
public class FindFirstRepeatingCharacterString {
	public static void main(String[] args) {
		String str = "abbca";
//
//	Set<Character> set= new HashSet<>();
//
//	for(int i=0;i < str.length();i++){
//		if(set.contains(str.charAt(i))){
//			System.out.println("First repeating character " + str.charAt(i));
//			break;
//		}else{
//			set.add(str.charAt(i));
//		}
//	}

	////////////////////////////////
	//Frequnecy of element
	int[] charCount = new int[26];
	for(int i=0; i<str.length(); i++){
		charCount[str.charAt(i) - 'a']++;
	}

	for(Integer c: charCount){
		System.out.println(c);
	}


	}
}
/*
public class FirstRepeatingChar {
    public static char findFirstRepeatingChar(String str) {
        int[] frequency = new int[256]; // ASCII character set, size 256

        // Iterate through each character of the string
        for (char c : str.toCharArray()) {
            frequency[c]++;  // Increment the frequency count of the character

            // If the frequency of the character is greater than 1, it's repeating
            if (frequency[c] > 1) {
                return c;  // Return the first repeating character
            }
        }

        // If no repeating character is found, return a special value (e.g., '\0')
        return '\0';  // Indicating no repeating character
    }

    public static void main(String[] args) {
        String str = "abca";
        char result = findFirstRepeatingChar(str);

        if (result != '\0') {
            System.out.println("First repeating character: " + result);
        } else {
            System.out.println("No repeating characters found");
        }
    }
}

 */