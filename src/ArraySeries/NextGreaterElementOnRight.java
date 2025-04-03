import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Stack;


//object --- non null print


//Done
public class NextGreaterElementOnRight {

	public static int[] nextGreaterElementRight(int arr[]) {
		Stack<Integer> stk = new Stack<>();
		int[] nge = new int[arr.length];
		int length = arr.length - 1;
		Arrays.fill(nge, -1);

		for (int i = length; i >= 0; i--) {

			while (!stk.isEmpty() && stk.peek() <= arr[i]) {
				stk.pop();
			}
			if (!stk.isEmpty()) {
				nge[i] = stk.peek();
			}

			stk.push(arr[i]);

		}
		List<Integer> list = List.of();
		


		return nge;
	}

	public static void main(String[] args) {
		int[] arr = {6, 8, 0, 1, 3};
		int result[] = nextGreaterElementRight(arr);
		for (int x : result) {
			System.out.print(x + " ");
		}

	}
}
