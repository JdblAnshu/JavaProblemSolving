//https://www.geeksforgeeks.org/number-subarrays-sum-exactly-equal-k/
//Given an unsorted array of integers, the task is to find the number of subarrays having a sum exactly equal to a given number k.

//Done
public class CountSubarraySum {
	/*
	count subarray sum :
public int subarraySum(int[] a, int k) {
        int n = a.length; // size of the array.
        int count = 0;
        Map<Integer, Integer> preSumToFrequencyMap = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += a[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                count++;
            }

            // calculate the sum of remaining part i.e. x-k:
            int rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumToFrequencyMap.containsKey(rem)) {
                count+= preSumToFrequencyMap.get(rem);
            }

            //Finally, update the map checking the conditions:
            preSumToFrequencyMap.put(sum,preSumToFrequencyMap.getOrDefault(sum,0) + 1);
        }

        return count;
    }
	 */
}
