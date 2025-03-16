import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterString {

	public static void main(String[] args) {

		String input = "swiss";
		Map<Character,Integer> map= new HashMap<>();

		for(int i = 0; i<input.length();i++){
			if(map.containsKey(input.charAt(i))){
				map.put(input.charAt(i), map.getOrDefault(input.charAt(i),0)+1);
			}else {

			}
		}
//Solution
//		HashMap<Character, Integer> charCountMap = new HashMap<>();
//
//		// First, iterate over the string to count the frequency of each character
//		for (char c : input.toCharArray()) {
//			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
//		}
//
//		// Now, iterate through the string again to find the first character with a frequency of 1
//		for (char c : str.toCharArray()) {
//			if (charCountMap.get(c) == 1) {
//				return c;  // Return the first non-repeating character
//			}
//		}








	}
}
