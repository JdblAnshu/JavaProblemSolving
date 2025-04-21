import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


	/*
	Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.

*/

public class RearrangeArrayElementBySign {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] result = rearrangeArray(arr);

        System.out.println(Arrays.toString(result));
    }

    public static int[] rearrangeArray(int[] nums) {
        Queue<Integer> positives = new LinkedList<>();
        Queue<Integer> negatives = new LinkedList<>();

        // Separate numbers by sign
        for (int num : nums) {
            if (num >= 0) {
                positives.offer(num);
            } else {
                negatives.offer(num);
            }
        }

        // Alternate insertion
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = positives.poll(); // Even index: positive
            } else {
                result[i] = negatives.poll(); // Odd index: negative
            }
        }

        return result;
    }
}
/*

import java.util.Arrays;

public class RearrangeBySignAlt {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] result = rearrangeArray(arr);

        System.out.println(Arrays.toString(result));
    }

    public static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;

        for (int num : nums) {
            if (num >= 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        return result;
    }
}



 */
