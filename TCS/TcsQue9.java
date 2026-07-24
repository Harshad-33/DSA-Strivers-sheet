package TCS;
/*
    Frequency of character in alphabetical order..
*/
import java.util.Scanner;
import java.util.HashMap;
public class TcsQue9 {
    public static void CharFreqAlphabetical(String str){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char ch='a';ch<='z';ch++){
            if(hm.containsKey(ch)){
                System.out.print(ch+":"+hm.get(ch)+",");
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.nextLine();
        CharFreqAlphabetical(str);
    }
}

