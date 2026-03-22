public class Pat9FullUpDownPyramid {

	public static void main(String[] args) {

		int rows = 5;

		for(int i = 1; i<=rows; i++){
			for(int k = 1; k<=rows-i; k++){
				System.out.print(" ");
			}

			for (int j = 1; j<= 2*i -1; j++){
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i = rows; i>0; i--){
			for(int k = 1; k<=rows-i; k++){
				System.out.print(" ");
			}

			for (int j = 1; j<= 2*i -1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
