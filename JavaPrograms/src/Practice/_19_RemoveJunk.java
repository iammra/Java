package Practice;

public class _19_RemoveJunk {

	public static void main(String[] args) {

		String s = "This - text ! has \\ /allot # of % special % characters";

		// Regular Expression : [^a-zA-Z0-9]
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}
}

