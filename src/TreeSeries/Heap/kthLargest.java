package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

//Kth Largest of element https://leetcode.com/problems/kth-largest-element-in-an-array/:
public class kthLargest {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	}
}

/*
//Done
class Solution {
    public  int findKthLargest(int[] input, int k) {
		//k = 2
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            minHeap.add(input[i]);
        }

        for(int i=k;i<input.length;i++) {
            if(input[i]> minHeap.peek() ) {
                minHeap.poll();
                minHeap.add(input[i]);
            }
        }

        return minHeap.peek();
    }
}
 */

