package Practice;

import java.util.HashSet;
import java.util.Set;

public class _30_RemoveDuplicates {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 6, 3, 1 };
		int n = arr.length;
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < n; i++) {
			set.add(arr[i]);
		}
		System.out.println("Array without duplicate: " + set + ".");

	}
}
