package Practice;

public class _31_RunLengthEncoding {

	public static void printRLE(String str)
	    {
	        int n = str.length();
	      int count = 1;
	        for (int i = 1; i < n; i++) {

	            // Count occurrences of current character
	            
	            if(str.charAt(i) == str.charAt(i-1)){
	              count++;
	            }
	          else{
	            System.out.print(str.charAt(i));
	            System.out.print(count);
	            count = 1;
	          }

	            // Print character and its count
	            System.out.print(str.charAt(i));
	            System.out.print(count);
	        }
	    }

	public static void main(String[] args) {
		String str = "wwwwaaadexxxxxxywww";
		printRLE(str);
	}
}
