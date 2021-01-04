package Practice;

import java.util.Scanner;

//https://javaconceptoftheday.com/java-interview-programs-with-solutions/
public class _01_fibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int inputNumber = sc.nextInt();
		
		System.out.println("Fibonacci series upto " + inputNumber +" numbers : ");
		
		for(int i =1 ; i<=inputNumber; i++) {
			System.out.println(fibonacci(i) +" ");
		}
	}
		
	public static int fibonacci(int number) {
		if(number == 1 || number == 2) {	
			return 1;
		}
		
		int firstTerm = 1; int secondTerm = 1; int fibonacci = 1;
		
		for(int i=3; i<=number ; i++) {
			fibonacci = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = fibonacci;
		}
		return fibonacci;
	}

}
