package Practice;

import java.util.Scanner;

public class _12_SumOfAllDigits {
	public static void main(String args[]) {
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		int original = num;
		
		while (num != 0 ) {
			int remainder = num % 10;
			sum = sum + remainder;
			num = num / 10;
		}
		
		System.out.println("Sum of all digits of "+ original + " is " + sum);
	}

}
