package Practice;

public class _07_RemoveAllWhiteSpace {
	public static void main(String args[]) {
		String s = "       My     name   is             MRA   ";
		s = s.replaceAll("\\s", "");
		System.out.println(s);
	}
}
