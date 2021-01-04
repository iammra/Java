package Practice;

public class _10_EqualityOfTwoArrays {
	public static void main(String args[]) {
		int[] arrayOne = { 2, 5, 1, 7, 5 };
		int[] arrayTwo = { 2, 5, 1, 7, 4 };

		boolean isEqual = true;

		if (arrayOne.length == arrayTwo.length) {
			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] != arrayTwo[i]) {
					isEqual = false;
				}
			}
		} else {
			isEqual = false;
		}
		if (isEqual) {
			System.out.println("Two arrays are equal");
		} else {
			System.out.println("Two arrays are not equal");
		}
	}
}

	
    //public static void main(String[] args)
    //{
        //String[] s1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
 
        //String[] s2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};
 
        //Arrays.sort(s1);
 
        //Arrays.sort(s2);
 
        //System.out.println(Arrays.equals(s1, s2));       //Output : true
    //}

