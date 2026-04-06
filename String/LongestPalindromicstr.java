package String;

public class LongestPalindromicstr {
    public static String longestPalindrome(String s) {
        String result = "";
        for(int i=0;i<s.length();i++){
            // odd length
            String p1 = expands(s, i, i);

            // even length
            String p2 = expands(s, i, i+1);

            if(p1.length() > result.length()){
                result = p1;  
            }
            if(p2.length() > result.length()){
                result = p2;
            }
        }
        return result;
    }
    private static String expands(String s , int left , int right){
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        return s.substring(left+1, right);
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
