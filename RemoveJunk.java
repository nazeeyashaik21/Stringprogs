package Strings;

public class RemoveJunk {

	public static void main(String[] args) {
		String s ="$dfhjd$,fd121314fd";
		s= s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		
	}

}
