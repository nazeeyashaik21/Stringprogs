package Strings;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
				 String s = "GeeksforGeeks";
				int g= 2, j=1;
				
			        System.out.println(g+j+s+3);
			        //System.out.println(s.concat(g));
			        
			        String s1= "JAVA";
			        String s2 = "JAVA";
			        String s3 = new String("JAVA");
			        System.out.println(s1==s2);
			        System.out.println(s1.equals(s2));
			        s1= s1+"new";
			        System.out.println(s1==s2);
			        System.out.println(s1.equals(s2));
			        System.out.println(s1==s3);
			        System.out.println(s1.equals(s3));
			        s3=s3+"new";
			        System.out.println(s1==s3);
			        System.out.println(s1.equals(s3));
			        System.out.println("Substring:" +s.substring(4, 8));
			        
			     
	}

}
