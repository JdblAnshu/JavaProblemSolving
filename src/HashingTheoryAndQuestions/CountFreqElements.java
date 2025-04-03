import java.util.Arrays;
import java.util.List;

public class CountFreqElements {

	public static void freqElement(int arr[]){
		int freq[] = new int[5];

		for(int i=0;i<arr.length;i++){
			freq[arr[i]]++;
		}

		for(int e:freq){
			System.out.print(e + " ");
		}

	}

	public static void freqCharElement(String str){
		int freqChar[] = new int[26];


		for(int i=0;i<str.length();i++){
			freqChar[str.charAt(i) - 'a']++;
		}

		for(int e:freqChar){

//			System.out.print(e + " <-----> " + (freqChar[e-'a']));
			System.out.print(List.of(freqChar[e - 'a']));

		}

	}



	public static void main(String[] args) {
		int arr[] ={0,1,2,3,1,2,2,3,4};
		freqElement(arr);
		System.out.println("--------------------------------------------");

		//Count freq of characters
		String str= "iiiinpput";
		freqCharElement(str);



	}
}
/*
dont substract 'a' if str has both small a or b and capital A or B
   int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++; // donot substract
        }
 */