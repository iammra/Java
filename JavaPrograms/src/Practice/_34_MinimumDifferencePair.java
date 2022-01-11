package Practice;

import java.util.Arrays;

public class _34_MinimumDifferencePair {

	static int getMinimumDif(int[] arr, int n) {
		Arrays.sort(arr);
		int output = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++)
			if (arr[i + 1] - arr[i] < output)
				output = arr[i + 1] - arr[i];
		return output;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 1, 6, 8, 20, 13 };
		System.out.println("Minimum difference : " + getMinimumDif(arr, arr.length));
	}

}
