public class NumberPat {

	public static void main(String[] args) {
		int no = 6;
		int startNum = 1;

		for(int i = 1; i<no; i++){

			for(int j = 1; j<=i; j++){
				System.out.print(startNum + " ");
				startNum+=1;
			}
			System.out.println();


		}
	}
}
