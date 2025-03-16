public class MaxConsecutiveOne {
	/*
	Maximum Consecutive Ones:

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //matain the length of consective 1
        int maxConsecutiveLength = 0;
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                j++;
            } else{
                if(j>maxConsecutiveLength){
                    maxConsecutiveLength = j;
                }
                j = 0;
            }
        }

                if(j>maxConsecutiveLength){
                    maxConsecutiveLength = j;
                }

        return maxConsecutiveLength;

    }
}
	 */
}
