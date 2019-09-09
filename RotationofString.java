package Strings;

public class RotationofString {
	
	public boolean method1(String s1, String s2) {
		if(s1.length()!=s2.length())
		return false;
		else 
			return isSubstring(s1+s1,s2);
		
		
	}

	private boolean isSubstring(String s1, String s2) {
		if(s1.contains(s2))
		return true;
		else
			return false;
	}
	public boolean method2(String s1, String s2) {
		if(s1.length()==s2.length()&&((s1+s1).indexOf(s2))!=-1) {
			System.out.println((s1+s1).indexOf(s2));
			return true;
		}
		
		else
			return false;
		
	}

	public static void main(String[] args) {
		
		RotationofString obj = new RotationofString();
		boolean flag = obj.method2("waterbottel", "bottelwater");
		if(flag)
			System.out.println("is rotational");
		else
			System.out.println("is not rotational");
	}

}
