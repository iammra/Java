package Practice;

import java.util.Arrays;

public class _11_AnagramProgram {
	public static void main(String args[]) {
		boolean isAnagram = true;

		String s1 = "Keep";
		String s2 = "Peek";

		// Remove all whitespace
		String s1_new = s1.replaceAll("//s", "");
		String s2_new = s2.replaceAll("//s", "");

		if (s1_new.length() != s2_new.length()) {
			isAnagram = false;
		} else {

			char[] s1Array = s1_new.toLowerCase().toCharArray();
			char[] s2Array = s2_new.toLowerCase().toCharArray();

			Arrays.sort(s1Array);
			Arrays.sort(s2Array);

			isAnagram = Arrays.equals(s1Array, s2Array);
		}

		if (isAnagram) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}

	}
}
