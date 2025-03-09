package GenericsSamples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Lower Bounded Wildcard: The lower-bounded wildcard <? super T> allows you to specify that the type must be T or any of its superclasses.

public class LowerBoundTypeParameters {

	public static <T> void addNumbers(List<? super T> list) {
		// Can add T or its subclasses to the list
		//System.out.println(T instanceof Number);

		list.add((T) new Double(10.5));  // This works because T is Number
	}

	public static void main(String[] args) {
//		// Case 1: T is Number, and list is List<Number> (exactly matches T)
//		List<Number> numberList = new ArrayList<>();
//		addNumbers(numberList);  // Works because T is Number
//		System.out.println(numberList); // Output: [10.5]
//
//		// Case 2: T is Number, and list is List<Object> (superclass of Number)
//		List<Object> objectList = new ArrayList<>();
//		addNumbers(objectList);  // Works because Object is a superclass of Number
//		System.out.println(objectList); // Output: [10.5]

		// Case 3: T is Number, and list is List<Integer> (subclass of Number)
		List<Integer> integerList = new ArrayList<>();
		addNumbers(integerList);  // Works because Integer is a subclass of Number

		Object obj = integerList.get(0);
		System.out.println(obj instanceof Double);

		System.out.println(integerList);


		Double deer = 1.0;
		//Integer i = Integer.valueOf(deer);
	}
}
