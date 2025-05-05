import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordInString {
	public static void main(String[] args) {
		/*
		Input: s = "the sky is blue"
		Output: "blue is sky the"
		 */
		String str = "the sky is blue";
		String[] str2 = str.split(" ");
		List<String> list =Arrays.asList(str.split(" "));
		StringBuilder sb = new StringBuilder();
		for(int i = str2.length-1;i>=0;i--){
			sb.append(str2[i] + " ");
		}
		System.out.println(sb);

	Collections.reverse(list);

	System.out.println(String.join(" " ,list));




	}
}
