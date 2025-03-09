import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
//https://www.youtube.com/watch?v=_RtghJnM1Qo
//	Input: [4, 8, 5, 2, 25]
//	Output: [2, 5, 2, -1, -1]

	//Write program for previous greater and previous smaller element

	public static int[] previousGreaterElement(int[] arr) {
		//int[] arr = {4, 8, 51, 2, 25};
		//output ---> -1, -1, -1, 51, 51
		Stack<Integer> stk = new Stack<>();
		int[] pge = new int[arr.length];
		Arrays.fill(pge, -1);
		stk.push(arr[0]); // if you want to push an element before then you should start with i = 1 in for loop

		for (int i = 1; i <= pge.length - 1; i++) {
			while (!stk.isEmpty() && arr[i] >= stk.peek()) {
				stk.pop();
			}

			if (!stk.isEmpty()) {
				pge[i] = stk.peek();
			}
			stk.push(arr[i]);
		}


		return pge;
	}

	public static int[] previousSmallerElement(int[] arr) {

		//int[] arr = {4, 8, 51, 2, 25};
		//output ---> -1, 4, 8, -1, 2
		Stack<Integer> stk = new Stack<>();
		int[] pse = new int[arr.length];
		Arrays.fill(pse, -1);
		//stk.push(arr[0]); // this is alternative solution where we dont push any element and start from i = 0, which is same previous followed approach.

		for (int i = 0; i <= pse.length - 1; i++) {
			while (!stk.isEmpty() && arr[i] <= stk.peek()) {
				stk.pop();
			}

			if (!stk.isEmpty()) {
				pse[i] = stk.peek();
			}
			stk.push(arr[i]);
		}


		return pse;

	}

	public static int[] nextSmallerElement(int[] arr) {

		//int[] arr = {4, 8, 51, 2, 25};
		//output ---> 2, 2, 2, -1, -1
		Stack<Integer> stk = new Stack<>();
		int[] nse = new int[arr.length];
		Arrays.fill(nse, -1);
		//stk.push(arr[arr.length - 1]);

		for (int i = nse.length -1 ; i >=0; i--) {
		//	while (!stk.isEmpty() && stk.peek() <= arr[i]) {
			while (!stk.isEmpty() && arr[i] <= stk.peek()) {
				stk.pop();
			}

			if (!stk.isEmpty()) {
				nse[i] = stk.peek();
			}
			stk.push(arr[i]);
		}


		return nse;

	}



	public static void main(String[] args) {
		int[] arr = {4, 8, 51, 2, 25};
		System.out.println("Pervious Greater element -------------------------");
		int[] pgeResult = previousGreaterElement(arr);
		for (int x : pgeResult) {
			System.out.print(x + " ");
		}
		System.out.println("Pervious smaller element -------------------------");
		int[] pseResult = previousSmallerElement(arr);
		for (int x : pseResult) {
			System.out.print(x + " ");
		}

		System.out.println("Next smaller element -------------------------");
		int[] nseResult = nextSmallerElement(arr);
		for (int x : nseResult) {
			System.out.print(x + " ");
		}

	}

	public int[] findNextSmallerElement() {

		return new int[]{};
	}


}
