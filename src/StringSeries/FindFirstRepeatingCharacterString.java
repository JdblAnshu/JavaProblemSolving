import java.util.HashSet;
import java.util.Set;

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
