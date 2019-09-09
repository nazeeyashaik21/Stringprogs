package Strings;

import java.util.LinkedHashSet;

public class RemoveduplicateCharacters {

	public static void removeDuplicates(String s) {
		char[] ch = s.toCharArray();

		LinkedHashSet set = new LinkedHashSet();

		for (Character c : ch) {
			set.add(c);

		}

		System.out.println(set.toString());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDuplicates("Nazeeya");
	}

}
