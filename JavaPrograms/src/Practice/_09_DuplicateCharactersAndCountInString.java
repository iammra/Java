package Practice;

import java.util.HashMap;
import java.util.Set;

public class _09_DuplicateCharactersAndCountInString {
	public static void main(String args[]) {
		duplicateCharCount("Better Butter");
	}

	private static void duplicateCharCount(String inputString) {
		// Creating HashMap containing char as key and it's occurrences as value
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		// Converting given string into character array
		char[] strArray = inputString.toCharArray();

		// checking each char of character array
		for (char c : strArray) {
			// if char is present in HashMap, increase the count by 1
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
				// if char is not present in HashMap, put this char to HashMap with 1 as it's
				// value
			} else {
				charCountMap.put(c, 1);
			}
		}

		// Getting a set containing all keys of HashMap
		Set<Character> charInString = charCountMap.keySet();
		System.out.println("Duplicate characters in " + inputString);

		//Iterating through Set(which has all the keys of HashMap)
		for (Character ch : charInString) {
			if (charCountMap.get(ch) > 1) {
				//If any char has a count of more than 1, printing it's count
				System.out.println(ch + " : " + charCountMap.get(ch));
			}
		}
	}
}
