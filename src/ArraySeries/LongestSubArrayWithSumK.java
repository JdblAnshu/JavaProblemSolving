import java.util.HashMap;

public class LongestSubArrayWithSumK {

	//Longest subarray with k sum  (postive negative case)


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
        // Not adding to make sure we store lowest index of prefix sum.
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

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        int k = 9;
        int result = lenOfLongSubarr(arr, arr.length, k);
        System.out.println("Length of longest subarray with sum " + k + " is: " + result);
    }


}

