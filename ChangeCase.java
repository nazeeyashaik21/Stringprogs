package Strings;

public class ChangeCase {
	public static void changeCases(String s) {
		for(int i=0; i<s.length();i++) {
			int ch= s.charAt(i);
			if(i==0 && (ch>64 && ch<91)	) {
				System.out.print((char)ch);
			}
			
			else if(ch>64 && ch<91) {
				ch= ch+32;
				System.out.print((char)ch);
			}
			else if(ch>96 && ch<123) {
				ch= ch-32;
				System.out.print((char)ch);
			}
			else if(ch==32) {
				System.out.print("");
			}
		}
	}

	public static void main(String[] args) {
		changeCases("ARHAAN");

	}

}
