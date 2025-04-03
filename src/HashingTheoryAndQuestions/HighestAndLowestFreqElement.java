import java.util.HashMap;
import java.util.Map;

public class HighestAndLowestFreqElement {

	public static void lowestAndHighestFreqElement(int arr[]){
		Map<Integer,Integer> map = new HashMap<>();

		for(int i = 0;i< arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1);
			}else {
				map.put(arr[i],1);
			}
		}


		int maxElement = -1;
		int minElement = -1;
		int maxElementFreq = Integer.MIN_VALUE;
		int minElementFreq = Integer.MAX_VALUE;

		for(Map.Entry<Integer,Integer> es : map.entrySet()){
			int count = es.getValue();
			int value = es.getKey();
			if(count > maxElementFreq){
				maxElementFreq = count;
				maxElement = value;
			}

			if(count<minElementFreq){
				minElementFreq = count;
				minElement = value;
			}

		}
		System.out.println("maxElementFreq " + maxElementFreq + " maxElement " + maxElement);
		System.out.println("minElementFreq " + minElementFreq + " minElement " + minElement);

	}

	public static void main(String[] args) {
		int arr[] = {5,5,5,5,2,2,3,3,4,7,7};

		lowestAndHighestFreqElement(arr);


	}
}
