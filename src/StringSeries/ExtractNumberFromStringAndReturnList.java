import java.util.ArrayList;
import java.util.List;

public class ExtractNumberFromStringAndReturnList {


	public static List<Integer> extractNumbers(String input) {
		List<Integer> integerList = new ArrayList<>();

		for (char ch : input.toCharArray() ){
			if(Character.isDigit(ch)){
				integerList.add(Integer.parseInt(String.valueOf(ch)));
			}
		}
		return integerList;

	}

	public static void main(String[] args) {
		String input = "abc11123def456ghi789";
		List<Integer> numbers = extractNumbers(input);

		// Print the extracted numbers
		System.out.println(numbers);

	}
}
