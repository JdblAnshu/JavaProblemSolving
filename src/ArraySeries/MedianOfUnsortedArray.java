public class MedianOfUnsortedArray {
}

/*
//The basic idea is to sort the array and check the array size if it is odd then return the middle otherwise return the average of the two middle elements.
import java.util.Arrays;

class GfG {
    static double findMedian(int[] arr) {
        int n = arr.length;

        // First we sort the array
        Arrays.sort(arr);

        // check for even case
        if (n % 2 != 0)
            return arr[n / 2];

        return (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 7, 5, 8, 6 };
        double ans = findMedian(arr);
        System.out.println(ans);
    }
}

 */