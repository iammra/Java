package Practice;

import java.util.Scanner;

public class _22_Factorial_Recursion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: " );
		int num = sc.nextInt();
		int ans = factorial(num);
		System.out.println("Factorial of " +num+ " is : " + ans);
	}

	static int factorial(int n) {
		if (n == 0 || n == 1)
			return 1;
		return n * factorial(n - 1);
	}
}
