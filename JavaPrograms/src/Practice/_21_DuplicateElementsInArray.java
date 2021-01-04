package Practice;

import java.util.HashSet;
import java.util.Set;

public class _21_DuplicateElementsInArray {

	public static void main(String[] args) {

	String names[] = {"Java", "Ruby", "C", "Python", "Java"};
	
	// 1. worst solution : 0(nxn)
	for(int i = 0 ; i < names.length; i++) {
		for(int j = i+1 ; j<names.length; j++) {
			if(names[i].equals(names[j])) {
				System.out.println("Duplicate element is ::: " + names[i]);
			}
		}
	}
	
	System.out.println("***************************************");
	
	// 2. 
	Set<String> store = new HashSet<String>();
	for(String name : names) {
		if(store.add(name) == false) // unique elements are only added in set, if element already exists it will return false
			System.out.println("Duplicate element is ::: " + name);
	}
	
	

	
	
	

		
	}

}
