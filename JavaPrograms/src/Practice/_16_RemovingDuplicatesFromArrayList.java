package Practice;

import java.util.ArrayList;
import java.util.HashSet;

public class _16_RemovingDuplicatesFromArrayList {
	public static void main(String args[]) {
		ArrayList<String> listWithDuplicates = new ArrayList<>();

		listWithDuplicates.add("JAVA");
		listWithDuplicates.add("J2EE");
		listWithDuplicates.add("STRUTS");
		listWithDuplicates.add("JAVA");

		System.out.println("List with duplicate elements : " + listWithDuplicates);

		HashSet<String> set = new HashSet<>(listWithDuplicates);

		ArrayList<String> listWithoutDuplicates = new ArrayList<>(set);

		System.out.println("List without duplicate elements : " + listWithoutDuplicates);

	}
}
