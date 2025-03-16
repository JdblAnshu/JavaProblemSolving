public class MoveZerosToEnd {
	/*
	class Solution {
    public void moveZeroes(int[] nums) {
            // [0,1,0,3,12]
            int firstZeroIndex = -1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    firstZeroIndex = i;
                    break;
                }
            }

            if(firstZeroIndex == -1){
                return;
            }

            for(int i =firstZeroIndex+1; i<nums.length;i++ ){
                if(nums[i]!=0){
                    int temp = nums[i];
                    nums[i] = nums[firstZeroIndex];
                    nums[firstZeroIndex] = temp;
                    firstZeroIndex++;
                }
            }
    }
}
	 */
}
