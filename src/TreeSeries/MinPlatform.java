import java.util.Arrays;

public class MinPlatform {

	public static int calculateMinPlatforms(int arr[], int dep[], int n) {

		Arrays.sort(arr);
		Arrays.sort(dep);

		int plat_needed = 1;
		int result = 0;

		int i = 1;
		int j = 0;

		while (i < n && j < n) {

			// If next train arrives before previous departs
			if (arr[i] <= arr[j]) {
				plat_needed++;
				i++;
			}
			// If train departs
			else {
				plat_needed--;
				j++;
			}

			result = Math.max(result, plat_needed);
		}

		return result;
	}

	public static void main(String[] args) {

		int arr[] = {800, 805, 810, 815, 820, 825, 910};
		int dep[] = {840, 845, 850, 855, 920, 935, 955};

		int n = arr.length;

		int platforms = calculateMinPlatforms(arr, dep, n);

		System.out.println("Minimum Number of Platforms Required = " + platforms);
	}
}