public class SlidingWindowMax {

	//Max sliding window (https://leetcode.com/problems/sliding-window-maximum/)
	//GFG: https://www.geeksforgeeks.org/sliding-window-maximum-maximum-of-all-subarrays-of-size-k/
	/*
	class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        int n = a.length;
        int[] r = new int[n - k + 1];
        int ri = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < a.length; i++) {
            //Remove elements not present in the current window
            if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }
            //Remove all elements smaller than the currently being added element
            // (remove useless elements)
            while (!q.isEmpty() && a[i] >= a[q.peekLast()]) {
                q.pollLast();
            }

            q.offer(i);
            //We start storing result only after iterating through first window i.e. k
            if (i >= k - 1) {
                r[ri++] = a[q.peek()];
            }
        }
        return r;
    }
}
	 */
}
