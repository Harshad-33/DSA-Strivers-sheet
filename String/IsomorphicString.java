package String;
import java.util.HashMap;

public class IsomorphicString {
    public static boolean isomorphicString(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character , Character> map = new HashMap<>();
        HashMap<Character , Character> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map.containsKey(c1) && map.get(c1) != c2){
                return false;
            }
            if(map2.containsKey(c2) && map2.get(c2) != c1){
                return false;
            }
            map.put(c1, c2);
            map2.put(c2, c1);
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "paper" , t = "title";
        System.out.println(isomorphicString(s, t));
    }
}


