
package Strings;

public class ReverseStringRecursion {
	public static String reverse(String s) {
		if (s == null) {
			return null;
		}
		if (s.length() <= 1) {
			return s;
		}
		
		return reverse(s.substring(1)) + s.charAt(0);
	
	}

	public static boolean poliondrome(String s) {
		if (s == null)
			return false;
		String rev = reverse(s);
		return s.equals(rev);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(poliondrome("mom"));
		String str = "Mama";
		String val =str.substring(1)+str.charAt(0);
		System.out.println(val);
	}

}
