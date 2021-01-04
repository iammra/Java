package Practice;

import java.util.Scanner;

public class _04_PalindromeString {
	public static void main(String args[]) {
		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");

		original = sc.nextLine();
		int n = original.length();
		for (int i = n - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		if (original.equalsIgnoreCase(reverse)) {
			System.out.println(original + " is a palindrome string");
		} else {
			System.out.println(original + " is not a palindrome string");
		}

	}

}
