public class CountDivisibleDigit {
//Done
	public static int evenlyDivides(int num) {
		int m = num;
		int counter = 0;
		while(num>0){
			int digit = num%10;
			if(m%digit == 0 && digit >0){
				counter++;
			}
			num = num/10;

		}
		return counter;
	}

	public static void main(String[] args) {
		System.out.println("Count divisible digit....");
		System.out.println(evenlyDivides(1234));
	}
}
