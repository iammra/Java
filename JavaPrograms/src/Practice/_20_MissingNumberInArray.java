package Practice;

public class _20_MissingNumberInArray {
	public static void main(String args[]) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		int n = a.length;
		int total = (n + 1) * (n + 2) / 2;

		for (int i = 0; i < a.length; i++) {
			total = total - a[i];
		}

		for (int s : a) {
			System.out.print(s + " ");
		}

		System.out.println("\n" + "Missing number of array ::::: " + total);
	}
}
