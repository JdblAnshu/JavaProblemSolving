public class FibbonaciOfNum {

	public static int findFibbonaci(int n){
		if(n<=1)
			return n;

		return findFibbonaci(n-1)+findFibbonaci(n-2);

	}


	public static void main(String[] args) {
		int i =1;
		while (i<=5){

			System.out.println(findFibbonaci(i) + " ");
			i++;
		}


	}
}
