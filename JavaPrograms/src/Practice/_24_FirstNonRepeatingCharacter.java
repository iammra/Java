package Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class _24_FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String inputStr = "teeter";
		/*
		 * The method indexOf() returns the position of the first occurrence of a given
		 * character in a string whereas method lastIndexOf() returns the position of
		 * the last occurrence of a given character in a string.
		 */
		for (char i : inputStr.toCharArray()) {
			if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
				System.out.println("First non-repeating character is: " + i);
				break;
			}
		}

		System.out.println(" Please enter the input string :");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char ch = firstNonRepeatedCharacter(s);
		System.out.println("The first non repeated character is :  " + ch);
	}

	public static Character firstNonRepeatedCharacter(String str) {
		HashMap<Character, Integer> characterhashtable = new LinkedHashMap<Character, Integer>();
		int length;
		Character ch;
		length = str.length(); // Scan string and build hash table
		for (int i = 0; i < length; i++) {
			ch = str.charAt(i);
			if (characterhashtable.containsKey(ch)) {
				// increment count corresponding to ch
				characterhashtable.put(ch, characterhashtable.get(ch) + 1);
			} else {
				characterhashtable.put(ch, 1);
			}
		}
		for (Entry<Character, Integer> entry : characterhashtable.entrySet()) {
			if (entry.getValue() == 1)
				return entry.getKey();
		}
		return null;
	}

}
