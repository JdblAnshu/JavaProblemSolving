import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeOverlappingInterval {

	static List<int[]> mergeOverlap(int[][] arr) {
		int n = arr.length;

		Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
		List<int[]> res = new ArrayList<>();

		int[] prev = arr[0];

		for (int i = 1; i < arr.length; i++) {
			int[] interval = arr[i];
			if (interval[0] <= prev[1]) {
				prev[1] = Math.max(prev[1], interval[1]);
			} else {
				res.add(prev);
				prev = interval;
			}
		}

		res.add(prev);
		return res;
	}

	public static void main(String[] args) {
		int[][] arr = {{7, 8}, {1, 5}, {2, 4}, {4, 6}};
		List<int[]> res = mergeOverlap(arr);

		for (int[] interval : res) {
			System.out.println(interval[0] + " " + interval[1]);
		}
	}
}








class MergeOverlappingInterval2 {
	//Check in geeksforgeeks https://www.geeksforgeeks.org/merging-intervals/
	/*
	Solution in suggestion using lambdas and collections Array list


class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], interval[1]);
            } else {
                merged.add(prev);
                prev = interval;
            }
        }

        merged.add(prev);

        return merged.toArray(new int[merged.size()][]);
    }
}
	 */
}

/*

Solution tried by us

class Solution {

    public int[][] merge(int[][] intervals) {

        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(intervals, new Comparator<int[]>() {

            @Override
            public int compare(int o1[], int o2[]) {
                return o1[0] - o2[0];
            }

        });

        int index = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[index][1] >= intervals[i][0]) {

                intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]);

            } else {
                index++;
                intervals[index] = intervals[i];

            }
        }

        int outputArray[][] = new int[index + 1][2];

        for (int i = 0; i <= index; i++) {
            outputArray[i] = intervals[i];

        }

        return outputArray;

    }
}
 */
