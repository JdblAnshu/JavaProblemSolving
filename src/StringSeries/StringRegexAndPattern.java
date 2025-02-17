public class StringRegexAndPattern {


	public static void main(String[] args) {
		//1. Check if a string contains only digits

		String str = "12345";
		boolean isDigitOnly = str.matches("\\d+");
		System.out.println("101: result " + isDigitOnly);

		//2. Check if a string is a valid email

		String email = "example@domain.com";
		boolean isValidEmail = email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
		System.out.println(isValidEmail); // true if valid email




	}


}
