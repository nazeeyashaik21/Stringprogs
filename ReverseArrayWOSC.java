package Strings;

public class ReverseArrayWOSC {
	public static void method1(String s) {
		char[] ch=s.toCharArray();
		for ( int front =0, back = ch.length-1;front<=back;) {
			if(Character.isAlphabetic(ch[front])&& Character.isAlphabetic(ch[back])) {
				char temp = ch[front];
				ch[front]=ch[back];
				ch[back]=temp;
				front++;
				back--;
			}
			else if(Character.isAlphabetic(ch[front])&& !Character.isAlphabetic(ch[back])) {
				back--;
			}
			else
				front++;
		}
		
		System.out.println(new String(ch));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1("%jdhd$kdfjkd@");
		
		   
		 String s = "Geeks", g = "";
	        String f = s.concat(g);
	        if (f == s)
	            System.out.println("Both are same");
	        else
	            System.out.println("not same");
	        String e = s + g;
	        if (e == s)
	            System.out.println("Both are same");
	        else
	            System.out.println("not same");
	}

}
