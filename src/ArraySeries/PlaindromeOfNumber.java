public class PlaindromeOfNumber {

	public static boolean plaindrome(int num){

		int result = 0 ;
		int originalString = num;
		while (num>0){
			int digit = num % 10;
			result = result * 10 + digit;
			num = num/10;
		}
		return originalString == result;
	}

	public static void main(String[] args) {
		System.out.println(plaindrome(121));
		System.out.println(plaindrome(123));
	}

}

