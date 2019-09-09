package Strings;

import java.util.regex.Pattern;

public class isNumeric {
	public static boolean isnumberic(String s) {
		Pattern pat = Pattern.compile("\\d+");

		boolean res = pat.matcher(s).matches();
		if (res) {
			return true;
		} else
			return false;

	}
	public static void removeNumbers(String s) {
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
	}
	public static void removeLetters(String s) {
		System.out.println(s.replaceAll("[a-zA-Z!@#$%^&*()]", ""));
	}

	public static void main(String[] args) {
		boolean res = isnumberic("nadafd7353kjhj");
		removeNumbers("fkjahfkjdh76876");
		removeLetters("fdfhajkh$$7878$$dd");
		System.out.println(res);
	}

}
