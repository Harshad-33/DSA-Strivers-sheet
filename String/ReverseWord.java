package String;

public class ReverseWord {
    public static String revstring(String s){
        String reverse = "";
        for(int i=s.length()-1;i>=0;i--){
            reverse += s.charAt(i);
        }
        return reverse;
    }
    public static String reverseWords(String s) {
        s = s.trim();
        s = revstring(s);
        String result = "";
        for(int i=0;i<s.length();i++){
            String word = "";
            while(i<s.length() && s.charAt(i) != ' '){
                word += s.charAt(i);
                i++;
            }
            word = revstring(word);
            if(word.length() > 0){
                result += " "+word;
            }
        }
        return result.substring(1);
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}

