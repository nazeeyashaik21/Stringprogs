package Strings;

public class IsUnique {
	public static boolean isUnique(String s) {

		if (s.length() > 128)
			return false;
		boolean[] cha_val = new boolean[128];
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i);
			System.out.println(val);

			if (cha_val[val])
				return false;
			cha_val[val] = true;

		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = isUnique("make four");
		if (flag)
			System.out.println("Is unique");
		else
			System.out.println("Is not unique");
	}

}
