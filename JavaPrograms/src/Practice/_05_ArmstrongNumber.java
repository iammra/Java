package Practice;

import java.util.Scanner;

public class _05_ArmstrongNumber {
	public static void main(String args[]) {
		int number, original, remainder = 0;
		double result = 0;
		 
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		original = number;
		
		while(original != 0) {
			remainder = original % 10;
			result = result + Math.pow(remainder, 3);
			original =  original/10;
		}
		
		if(result == number) {
			System.out.println(number + " is an Armstrong number");
		}else {
			System.out.println(number + " is not an Armstrong number");	
		}
	}
	
}
