public class ReverseString {
//Done
//String immutability means that once a string object is created, its value cannot be changed. Any modification results in the creation of a new string.
//Strings are immutable for security, performance, and thread safety reasons. It prevents unwanted changes and helps optimize memory usage.
	//No, we cannot modify a string directly. Any modification creates a new string object.
	//Modifying a string results in a new string being created. The original string remains unchanged.
	//Immutability allows Java to reuse string objects from the String Pool, saving memory and improving performance by avoiding duplicate string objects.
	public static void main(String[] args) {

		String str = "Hello, World!";

		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println("Reversed String is " + reversed);


		//Reverse each word of string
		String str8 = "Hello, World!";
		String[] words = str8.split(" ");
		String result = "";
		StringBuilder sb2 = new StringBuilder();
		for(String w : words){
		sb2.append(new StringBuffer(w).reverse()).append(" ");
		}
		System.out.println("111: Reversed string is " + sb2);

		//Other important examples
		String s1 = "knowledge";
		System.out.println("S1 initial hashcode " + s1.hashCode());
		String s2 = s1;
		s1 = s1.concat(" base");
		System.out.println("Value of s2 is : " + s2 + " hashcode" + s2.hashCode());
		System.out.println(s1 + "hashcode" + s1.hashCode());

		String s3 = "Test1";
		String s4 = "Test1";
		System.out.println("Value of String " + (s3 == s4) );

		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());


		String s5 = "Test6";
		StringBuilder sb = new StringBuilder("Test6");
		System.out.println("Value of Second string " + (s5.equals( sb)) );


		System.out.println(s5.hashCode());
		System.out.println(sb.hashCode());



		//StringBuffer: Is thread-safe, meaning its methods are synchronized. This ensures that only one thread can access the method at a time, which can prevent issues when multiple threads are modifying a StringBuffer object concurrently.
		//StringBuilder: Is not thread-safe because its methods are not synchronized. This can lead to performance benefits in single-threaded applications or scenarios where thread safety is not a concern, as it avoids the overhead of synchronization.

	}
}
