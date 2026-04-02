package String;

import java.util.HashMap;

public class RomanToInt {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> hmp = new HashMap<>();
        hmp.put('I', 1);
        hmp.put('V', 5);
        hmp.put('X', 10);
        hmp.put('L', 50);
        hmp.put('C', 100);
        hmp.put('D', 500);
        hmp.put('M', 1000);
        int ans = 0;
        for(int i=0;i<s.length();i++){
            int curr = hmp.get(s.charAt(i));
            if(i<s.length()-1 && curr < hmp.get(s.charAt(i+1))){
                ans -= curr;
            }else{
                ans += curr;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}

