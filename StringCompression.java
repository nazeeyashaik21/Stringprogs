package Strings;

public class StringCompression {

    public String methodOne(String input){
        int countConsecutive = 0;
        String compressedString = "";
        for(int i=0; i<input.length(); i++){
            countConsecutive++;
            if(i+1 >= input.length() || input.charAt(i)!=input.charAt(i+1)){
                compressedString +=""+ input.charAt(i)+countConsecutive;
                countConsecutive = 0;
            }
        }
        return compressedString.length() > input.length() ? input : compressedString;
    }

    public String methodTwo(String input){
        int countConsecutive = 0;
        StringBuilder compressedString = new StringBuilder();
        for(int i=0; i<input.length(); i++){
            countConsecutive++;
            if(i+1 >= input.length() || input.charAt(i)!=input.charAt(i+1)){
                compressedString.append(input.charAt(i));
                compressedString.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressedString.length() > input.length() ? input : compressedString.toString();
    }

    public static void main(String[] args){
        StringCompression sc = new StringCompression();
        String compressedString = sc.methodTwo("aaabbbccceeef");
        System.out.println("Compressed string is :"+compressedString);
    }
}
