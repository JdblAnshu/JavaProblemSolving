import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NmeetingRoom {

	//Input: lectures[][] = {{0, 5}, {1, 2}, {1, 10}}
/* pair - first, second or time , hallreq
	0,+1
	6,-1
	1,+1;
	3,-1
	1,+1
	11,-1

	Sort based on Time

*/

	static class pair {
		int first, second;
		pair(int x, int y)
		{
			first = x;
			second = y;
		}
	}


	static int minHalls(int lectures[][], int n)
	{

		// Initialize a vector of pair, Time, first value
		// indicates the time of entry or exit of a lecture
		// second value denotes whether the lecture starts
		// or ends
		List<pair> Time = new ArrayList<>();

		// Store the lecture times
		for (int i = 0; i < n; i++) {
			Time.add(new pair(lectures[i][0], 1));
			Time.add(new pair(lectures[i][1] + 1, -1));
		}

		// Sort the vector
		//Collections.sort(Time, Comparator.comparingInt((pair A) -> A.first));

		Time = Time.stream().sorted(Comparator.comparingInt(t -> t.first)).toList();

		int answer = 0, sum = 0;

		// Traverse the Time vector and Update sum and
		// answer variables
		for (int i = 0; i < Time.size(); i++) {
			sum += Time.get(i).second;
			answer = Math.max(answer, sum);
		}

		// Return the answer
		return answer;
	}


	// Driver Code
	public static void main(String[] args)
	{
		int lectures[][]
				= { { 0, 2 }, { 2, 3 }, { 3, 10 } };
		int n = lectures.length;

		System.out.println(minHalls(lectures, n));
	}



}
