import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
public class LongestSubstrWithoutRepeatingCharacter {
	//Done
	public static void main(String[] args) {
		String str = "hithere";
		//ABCBA
	}
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
		String str = "abcabcbb";
		str.toLowerCase();

        Map<Character, Integer> count = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            count.put(c, count.getOrDefault(c, 0) + 1);
			//Example abac
            while (count.get(c) > 1) {
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
