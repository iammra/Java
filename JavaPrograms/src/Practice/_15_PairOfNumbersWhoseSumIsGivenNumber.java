package Practice;

public class _15_PairOfNumbersWhoseSumIsGivenNumber {

	public static void main(String args[]) {
		int[] inputNumber = { 4, 6, 5, -10, 8, 5, 20 };
		int sum = 10;

		System.out.println("Pairs of elements whose sum is " + sum + " are : ");

		for (int i = 0; i < inputNumber.length; i++) {
			for (int j = i + 1; j < inputNumber.length; j++) {
				if (inputNumber[i] + inputNumber[j] == sum) {
					System.out.println(inputNumber[i] + " + " + inputNumber[j] + " = " + sum);
				}
			}
		}
	}
}
