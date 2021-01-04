package Practice;

import java.util.Scanner;

public class _02_PrimeNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int input = sc.nextInt();
		
		boolean isItPrime = checkForPrime(input);
		if(isItPrime) {
			System.out.println(input+" is a prime number");
		}
		else {
			System.out.println(input+" is not a prime number");
		}
	}
	
	public static boolean checkForPrime(int num) {
		boolean isItPrime = true;
		
		if (num <=1) {
			isItPrime = false;
			return isItPrime;
		}
		else {
			for(int i=2 ; i<=num/2 ; i++) {
				if((num % 2) == 0) {
					isItPrime = false;
					break;
				}
			}
			return isItPrime;
		}
	}
	
}
