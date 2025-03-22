//Done
public class MergeStringAlternatively {

//	Input : string 1 :"geeks"
//			string 2 :"forgeeks"


	public static void main(String[] args) {
		String s1 = "geeks";
		String s2 = "forgeeks";
		StringBuilder result = new StringBuilder();


		for(int i = 0; i< s1.length() || i<s2.length(); i++){
			if(i< s1.length())
				result.append(s1.charAt(i));
			if(i<s2.length())
				result.append(s2.charAt(i));
		}


		System.out.println(result);

	}
}

