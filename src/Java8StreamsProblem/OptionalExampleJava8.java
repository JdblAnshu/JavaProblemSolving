import java.util.Optional;

public class OptionalExampleJava8 {



	public static void main(String[] args) {

		//Optional.of()
		//	If name is null, a NullPointerException will be thrown.
		//	When to Use: You should use Optional.of() when you are certain that the value will not be null.
		//	It's typically used when the presence of the value is guaranteed and null values should not be accepted.

		String name = "John";
		Optional<String> optionalName = Optional.of(name);  // This works

		String nullName = null;
		Optional<String> optionalNullName = Optional.of(nullName); // Throws NullPointerException



		//Optional.ofNullable()
		//Purpose: Creates an Optional that can either contain the provided value or be empty (Optional.empty()), depending on whether the value is null or not.

		//Behavior: If the provided value is null, it returns an empty Optional (i.e., Optional.empty()).
		// If the value is non-null, it returns an Optional containing the value.

		//If the value is null, it simply returns Optional.empty().
		// When to Use: You should use Optional.ofNullable() when the value might be null.
		// It provides a safer way to create Optional objects, handling both the presence and absence of the value gracefully.

		String name3 = "John";
		Optional<String> optionalName3 = Optional.ofNullable(name);  // Works fine, will contain "John"
		String nullName3 = null;
		Optional<String> optionalNullName3 = Optional.ofNullable(nullName);  // Will be an empty Optional

		String name2 = "John";
		Optional<String> optionalName2 = Optional.ofNullable(name);  // Contains "John"

		String nullName2 = null;
		Optional<String> optionalNullName2 = Optional.ofNullable(nullName);  // Contains Optional.empty()
//
//
//		Feature	Optional.of()
//			Null Handling	Throws NullPointerException if the value is null.
//			When to Use	When you are sure the value is not null.
//			Common Use Case	To ensure the value is non-null and handle null as an error.
//
//		Optional.ofNullable()
//			Returns Optional.empty() if the value is null.
//			When the value may or may not be null.
//			To handle potential null values gracefully without throwing exceptions.




	}
}
