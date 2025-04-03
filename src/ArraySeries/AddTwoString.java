import java.util.ArrayList;
import java.util.List;

class AddTwoString {
	public String addStrings(String num1, String num2) {
		StringBuilder str = new StringBuilder();

		int i = num1.length() - 1, j = num2.length() - 1, carry = 0, sum;

		while (i >= 0 || j >= 0 || carry > 0) {
			int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
			int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

			sum = digit1 + digit2 + carry;
			str.append(sum % 10);
			carry = sum / 10;
		}
		return str.reverse().toString();
	}

	public static void main(String[] args) {
//		String[] str = {"123","12333","1223"};
//
//		StringBuilder sb = new StringBuilder();
//
//		for(String e: str){
//		sb.append(new StringBuilder(e).reverse().append("").toString());
//		}
//
//		System.out.println(sb);



	}
}