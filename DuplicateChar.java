package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {
	public static void findDuplicate(String str) {
		char[] chars = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character c : chars) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}

			else {
				map.put(c, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s:%d%n", entry.getKey(),entry.getValue());
			}

		}

	}

	public static void main(String[] args) {
		
		findDuplicate("Nazeeya");
		System.out.println("@@@@@@@@");
		findDuplicate("Arhaan");
	}

}
