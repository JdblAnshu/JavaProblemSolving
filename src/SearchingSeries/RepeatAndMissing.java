import java.util.Arrays;

public class RepeatAndMissing {
	static void printTwoElements(int[] arr)
	{

		int length = arr.length;
		int repeating = -1, missing = -1;

		boolean[] visited = new boolean[length+1];

		Arrays.fill(visited,false);
//		for(boolean val:visited){
//			System.out.println(val);
//		}

		for(int i =0; i<length; i++){
			if(visited[arr[i]]){
				repeating = arr[i];
			}else {
				visited[arr[i]] = true;
			}

		}

		for(int i=1;i<length;i++){
			if(!visited[i]){
				missing = i;
				break;
			}
		}
		System.out.println("Repeating : " + repeating);
		System.out.println("Missing : " + missing);


	}

	public static void main(String[] args)
	{
		int[] arr = { 7, 4, 5, 5, 6, 2, 1 };
		printTwoElements(arr);
	}


}
