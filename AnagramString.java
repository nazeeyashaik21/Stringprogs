package Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class AnagramString {
	LinkedList<Integer> ll = new LinkedList<>();

	public boolean methodOne(String s1, String s2) {
		HashMap<Character, Integer> map1 = countLetters(s1);
		HashMap<Character, Integer> map2 = countLetters(s2);
		if (map1 != null && map2 != null) {
			for (Character ch : map1.keySet()) {
				if (map2.keySet().contains(ch)) {
					if (map1.get(ch) == map2.get(ch))
						continue;
					else
						return false;
				} else
					return false;
			}
		}

		return true;
	}

	private HashMap<Character, Integer> countLetters(String input) {
		HashMap<Character, Integer> localMap = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (i == 0)
				localMap.put(ch, 1);
			else if (localMap.containsKey(ch))
				localMap.put(ch, localMap.get(ch) + 1);
			else
				localMap.put(ch, 1);
		}
		return localMap;
	}

	public boolean methodTwo(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		else {
			return sort(s1).equals(sort(s2));
		}
	}

	private String sort(String s) {
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}

	public boolean methodThree(String word, String anoword) {
		if (word.length() != anoword.length()) {
			return false;
		}
		char[] ch = word.toCharArray();
		for (char c : ch) {
			int index = anoword.indexOf(c);
			System.out.println(index);
			
			if (index != -1) {
				System.out.println("1st  "+anoword.substring(0, index));
				System.out.println("2nd "+anoword.substring(index + 1, anoword.length()));
				anoword = anoword.substring(0, index) + anoword.substring(index + 1, anoword.length());

			} else
			return false;

		}
		return anoword.isEmpty();
	}

	public static void main(String[] args) {
		AnagramString as = new AnagramString();
		boolean result = as.methodThree("listen", "silent");
		if (result)
			System.out.println("Two given strings are anagram");
		else
			System.out.println("Two given strings are not anagram");
	}
}
