public class MoveZeroesToEnd {
    public static void main(String args[]) {
        int[] arr = {4,0, 1, 0, 3, 12, 0,0,4,0};
        timar(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void timar(int[] arr) {
        int ind=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]==0)
            {
                ind=i;
                break;
            }
        for(int i=ind+1;i<arr.length;i++) {
            if(arr[i]!=0) {
                arr[ind] = arr[i];
                arr[i] = 0;
            }
        }
    }
}
