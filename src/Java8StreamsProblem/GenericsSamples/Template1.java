package GenericsSamples;

import java.util.Arrays;
import java.util.List;

public class Template1<U> {
	private U value;

	public void setValue(U value) {
		this.value = value;
	}

	public U getValue() {
		return value;
	}

	public static <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.println(element);
		}
	}

	public static <T> void printArray(List<T> array) {
		for (T element : array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {

		Template1<Integer> intBox = new Template1<>();
		intBox.setValue(1234);
		System.out.println(intBox.getValue());
		Template1<String> strBox = new Template1<>();

		Integer[] arr = {1,2,3};

		printArray(Arrays.asList(1,2,3,4));




	}
}
