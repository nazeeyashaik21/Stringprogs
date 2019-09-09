package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class AnogramCheck {
	public static boolean Anogramc(String str1, String str2) {

		HashMap<Character, Integer> map1 = retrunMap(str1);
		HashMap<Character, Integer> map2 = retrunMap(str2);

		if(map1!=null && map2!=null){
            for(Character ch : map1.keySet()){
                if(map2.keySet().contains(ch)){
                    if(map1.get(ch)==map2.get(ch))
                        continue;
                    else
                        return false;
                }
                else
                    return false;
            }
        }

        return true;

	}

	public static HashMap<Character, Integer> retrunMap(String str) {
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c));
			} else {
				map.put(c, 1);
			}
		}
		return map;
	}
	
	public static boolean methodTwo(String s1, String s2) {
		if(s1.length()!=s1.length()) {
			return false;
		}
		else {
			
			return sort(s1).equals(sort(s2));
		}
	}

	public static String sort(String s) {
		char[]c= s.toCharArray();
		Arrays.sort(c);
		return new String(c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = methodTwo("peek", "keep");
		if (flag) {
			System.out.println("Both are Anogram");
		} else {
			System.out.println("Not Anogram");
		}
	}

}
