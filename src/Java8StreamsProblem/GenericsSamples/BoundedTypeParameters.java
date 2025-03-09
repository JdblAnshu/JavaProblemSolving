package GenericsSamples;


//Upper Bounded Wildcard: If you want to limit the type to a specific class or its subclasses:
public class BoundedTypeParameters<T extends Number> {  // T must be a subclass of Number
	private T value;

	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}


	public static void main(String[] args) {
		BoundedTypeParameters<Integer> btp = new BoundedTypeParameters<>();
		btp.setValue(123);
		System.out.println(btp.getValue());
//This will allow you to use Box<Integer>, Box<Double>, etc., but not Box<String>.
	}
}
