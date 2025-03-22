public class PrintPermutation {


	private static void printPermutation(String str,String asf) {


		for(int i=0;i<str.length();i++){

			char ch = str.charAt(i);
			String leftQ  = str.substring(0,i);
			String rightQ = str.substring(i+1);
			String restOfQuestion = leftQ + rightQ;
			printPermutation(restOfQuestion,asf + ch);


		}
		if(str.length()==0){
			System.out.println(asf);
			return;
		}

	}

	public static void main(String[] args) {
		String str = "abc";
		printPermutation(str,"");
	}

}
