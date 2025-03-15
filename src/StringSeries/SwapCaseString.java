public class SwapCaseString {
	public static void main(String[] args) {
		String input = "Hello World!";
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i< input.length();i++){
			char ch = input.charAt(i);
			if(Character.isLowerCase(ch)){
				sb.append(Character.toUpperCase(ch));
			} else if (Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			}else {
				sb.append(ch);
			}

		}


		System.out.println(sb);
	}
}


