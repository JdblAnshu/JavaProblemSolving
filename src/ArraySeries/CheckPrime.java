public class CheckPrime {

	public static boolean checkPrime(int num){
		int count = 0;

		for(int i = 1; i< Math.sqrt(num); i++){

			if(i * i !=num){
				count++;
			}

			if(num % i == 0){
				count++;
			}


		}

		return count == 2;
	}


	public static void main(String[] args) {
		System.out.println("Check Prime");
		System.out.println(checkPrime(3));
	}

}
