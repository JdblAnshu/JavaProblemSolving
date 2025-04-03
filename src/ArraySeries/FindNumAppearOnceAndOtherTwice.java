public class FindNumAppearOnceAndOtherTwice {
	//https://takeuforward.org/arrays/find-the-number-that-appears-once-and-the-other-numbers-twice/

	public static void main(String[] args) {



		int arr[] = {4,1,2,1,2};

		//1st appraoch
		int xor = 0;
		for(int e: arr)
		{
			xor^=e;
		}
		System.out.println(xor);


		//2nd approach

		/*
		    public static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // Declare the hashmap.
        // And hash the given array:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        //Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }
		 */

	}
}
