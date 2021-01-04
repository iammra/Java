package Practice;

public class _18_ReverseEachWordOfString {

	public static void main(String[] args) {
		String inputString = "My name is MRA";
		String reverseString = "";
		String[] words = inputString.split(" ");

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}

			reverseString = reverseString + reverseWord + " ";

		}

	}

}
