package Strings;

import java.util.StringTokenizer;

public class WordCount {

	public static int method1(String s) {
		if (s == null && s.isEmpty()) {
			return 0;
		}
		String[] str = s.trim().split("\\s");
		//System.out.println(str.toString());
		//System.out.println("Words in String: " + str.length);
		return str.length;
	}

	public static int method2(String s) {
		if (s == null && s.isEmpty()) {
			return 0;
		}
		StringTokenizer st = new StringTokenizer(s);

		//System.out.println("Words in String: " + st.countTokens());
		return st.countTokens();

	}

	public static int method3(String s) {

		boolean flag = false;
		int count = 0;
		int len = s.length() - 1;
		int i = 0;
		while (i <= len) {

			if (s.charAt(i) == ' ' || s.charAt(i) == '\n' || s.charAt(i) == '\t' &&Character.isLetter(s.charAt(i))) {
				flag = false;
			} else if (flag == false) {
				flag = true;
				++count;

			}
			++i;
		}
		return count;
	}
public static int method4(String s) {
	int i, count=0;
	char[] ch = new char[s.length()];
	for(i=0; i<s.length();i++) {
		ch[i]=s.charAt(i);
		//if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0))) {
			if(((ch[0]!=' ')&& (i==0)) ||((i>0)&&(ch[i]!=' ')&& (ch[i-1]==' '))){
			count++;
			
			}
			
		}
	return count;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(method1("Nazeeya    Sulthana Shaik"));
		System.out.println(method2("   Nazeeya    Sulthana            Shaik"));
		System.out.println(method3("  Nazeeya 	,	Sulthana "
				+ "Shaik"));
		System.out.println(method4("  Nazeeya 	,	Sulthana "
				+ "Shaik"));
	}

}
