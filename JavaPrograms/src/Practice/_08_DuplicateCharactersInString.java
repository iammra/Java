package Practice;

public class _08_DuplicateCharactersInString {
	public static void main(String args[]) {
		String str = "School";
		char[] strArray = str.toCharArray();
		System.out.println("Duplicates characters are: ");
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i] == strArray[j]) {
					System.out.println(strArray[i]);
					break;
				}
			}
		}

	}

}




