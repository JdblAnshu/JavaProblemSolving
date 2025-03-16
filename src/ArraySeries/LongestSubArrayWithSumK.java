public class LongestSubArrayWithSumK {
	/*
	Longest subarray with k sum  (postive negative case)

class Solution{


    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {

    HashMap<Integer,Integer> preSumToLowestIndex = new HashMap<>();
    int preSum=0;
    int maxLen=0;

    for(int i=0;i<N;i++){
        //key = prefix
        //value = lowest occruence index
        preSum+=A[i];

            if(preSum == K){
                maxLen = Math.max(maxLen, i+1);
            }

        if(!preSumToLowestIndex.containsKey(preSum)){
            preSumToLowestIndex.put(preSum,i);
        }
        int rem = preSum - K;

        if(preSumToLowestIndex.containsKey(rem)){
            int length = i - preSumToLowestIndex.get(rem);
            if(length>maxLen){
                maxLen= length;
            }
        }

    }

    return maxLen;


    }


}
	 */
}
