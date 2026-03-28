package String;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c, 0)+1);
        }

        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(!map.containsKey(c) || map.get(c)==0){
                return false;
            }
            map.put(c, map.get(c)-1);
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram" , t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
