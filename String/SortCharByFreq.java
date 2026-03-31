package String;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.*;

public class SortCharByFreq {
    public static String frequencySort(String s){
        HashMap<Character,Integer> hmp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hmp.put(ch,hmp.getOrDefault(ch,0)+1);
        }
        
        ArrayList<Character> list = new ArrayList<>();
        for(char ch : hmp.keySet()){
            list.add(ch);
        }

        Collections.sort(list, new Comparator<Character>() {
            public int compare(Character a , Character b){
                return hmp.get(b) - hmp.get(a);
            }
        });

        StringBuilder result = new StringBuilder();

        for(int i=0;i<list.size();i++){
            char ch = list.get(i);
            int freq = hmp.get(ch);
            for(int j=0;j<freq;j++){
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}


