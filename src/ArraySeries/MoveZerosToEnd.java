import java.util.Arrays;

public class MoveZerosToEnd {
	//Done
	/*
	class Solution {
    public void moveZeroes(int[] nums) {
            // [0,1,5,0,12,0]
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


















	public static void main(String[] args) {
		int arr[] = {0,1,2,3,0,4,5,0,0,1};

		//find first zero index
		int firstIndex = 0;

		for(int i=firstIndex+1;i<arr.length;i++){
			if(arr[i]!=0){
				int temp = arr[firstIndex];
				arr[firstIndex] = arr[i];
				arr[i]=temp;
				firstIndex++;
			}

		}

		Arrays.stream(arr).forEach(System.out::println);







	}
}
