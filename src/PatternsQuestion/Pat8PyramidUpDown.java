public class Pat8PyramidUpDown {
	public static void main(String[] args) {
		// 1 3 5 7 9

		int rows = 5;

		for(int i  = rows; i >0; i--){

			for (int j= 1; j <=rows-i; j++){
				System.out.print(" ");
			}

			for (int k = 1; k<=2*i -1 ; k++){
				System.out.print("*");
			}

			System.out.println();

		}


	}
}
