public class GcdOfTwoNum {
//check gpt explaination
	public static void main(String[] args) {
		System.out.println("Living life");

		int a = 20 , b = 15;


		while (a>0 && b>0){

			if(a>b){
				a = a%b;

			}else {
				b = b%a;
			}
		}

		if(a==0) {
			System.out.println( b);
		}

		System.out.println( a);
	}
}
