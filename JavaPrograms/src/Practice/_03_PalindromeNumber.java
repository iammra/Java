package Practice;

import java.util.Scanner;

public class _03_PalindromeNumber {
	
	public static void main (String args[]) {
		int original, reverse=0, remainder;
		Scanner sc = new Scanner(System.in);
		original = sc.nextInt();
		
		while(original != 0) {
			remainder = original % 10;
			reverse = reverse * 10 + remainder;
			original = original / 10;
		}
		
		if(original == reverse) {
			System.out.println(original+" is a palindrome number");
		}else {
			System.out.println(original+" is not a palindrome number");
		}
	}
}
