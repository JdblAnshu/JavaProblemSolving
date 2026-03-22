public class Pat7SpaceStar {

	public static void main(String[] args) {
		// 1 3 5 7 9

		int rows = 5;

		 for(int i  = 1; i <= rows; i++){

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
