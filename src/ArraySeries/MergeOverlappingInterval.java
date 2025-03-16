public class MergeOverlappingInterval {
	//Check in geeksforgeeks
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
