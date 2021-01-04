package Practice;

public class _17_isBinaryOrNot {
	public static void main(String args[]) {

		int number = 1011001;
		int copyOfNumber = number;
		boolean isBinary = true;

		while (copyOfNumber != 0) {
			int remainder = copyOfNumber % 10;
			if (remainder > 1) {
				isBinary = false;
			} else {
				copyOfNumber = copyOfNumber / 10;
			}
		}

		if (isBinary) {
			System.out.println(number + " is a binary number");
		} else {
			System.out.println(number + " is not a binary number");
		}

	}

}
