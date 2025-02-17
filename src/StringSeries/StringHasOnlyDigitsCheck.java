public class StringHasOnlyDigitsCheck {

	public static void main(String[] args) {
		String str = "123134";//"1234a"

		boolean isOnlyDigits = str.chars().allMatch(Character::isDigit);
		System.out.println(isOnlyDigits);

		boolean isDigits = true;
		for(int i =0;i<str.length(); i++){
			if(str.charAt(i) < '0' || str.charAt(i)>'9'){ //Dont forget to take as character
				isDigits = false;
				break;
			}
		}
		System.out.println(isDigits);

	}
}
