public class HalfPyramidUpAndDown {

	public static void main(String[] args) {

		int no = 5;
		for(int i = 1; i<=2 * no -1; i++ ){

			int stars = i;

			if (i>no){
				stars = 2 * no - i;
			}

			for(int j = 1; j<=stars; j++){
				System.out.print("*");
			}

			System.out.println();


		}
	}
}
