package Strings;

public class OneAway {

    public boolean isOneAway(String s1, String s2){
        if(s1.length() == s2.length())
            return isReplaced(s1, s2);
        else if(s1.length()+1 == s2.length())
            return isInserted(s1, s2);
        else if(s1.length()-1 == s2.length())
            return isInserted(s2, s1);
        else
            return false;
    }

    private boolean isReplaced(String s1, String s2){
        boolean replaced = false;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(replaced)
                    return false;
                replaced = true;
            }
        }
        return replaced;
    }

    private boolean isInserted(String s1, String s2){
        int index1 = 0, index2 = 0;
        while(index1 < s1.length() && index2 < s2.length()){
            if(s1.charAt(index1) == s2.charAt(index2)){
                index1++;
                index2++;
            }else{
                if(index1 != index2)
                    return false;
                index2++;
            }
        }
        return true;
    }

    public static void main(String[] args){
        OneAway oa = new OneAway();
        boolean resultReplace = oa.isOneAway("plays","pays");
        System.out.println("is oneway ? "+ resultReplace);
    }
}
