
/*
//https://www.programiz.com/java-programming/examples/pyramid-pattern

         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *

Number of stars pattern
1
3
5

Number of spaces pattern
4
3
2
1
0

 */

public class Pyramid {

	public static void main(String[] args) {

		int row = 5;

		for(int i=0; i<row;i++){
			//print spaces
			//print star

			for(int j=0;j<row-i;j++){
				System.out.print(" ");
			}

			for(int k=0;k<((2*i)+1);k++){
				System.out.print("*");
			}


		System.out.println();

		}


	}
}
