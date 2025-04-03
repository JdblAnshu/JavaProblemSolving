public class SumOfFirstnNaturalNums {


	public static int findSumOfFirstnNumbers(int sum,int n){

		if(n<=0) return sum;

		return findSumOfFirstnNumbers(sum+(n-1),n-1);

	}
	public static void main(String[] args) {

		System.out.println(findSumOfFirstnNumbers(0,6));

	}
}
