package String;

public class BeautySum {
    public static int beautySum(String s) {
        int beauty = 0;
        // finding substrings 
        for(int i=0;i<s.length();i++){
            int [] freq = new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j) - 'a']++;
                int max = 0;
                int min = Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k] > 0){
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }
                beauty += (max - min);
            }
        }
        return beauty;
    }
    public static void main(String[] args) {
        String  s = "aabcb";
        System.out.println(beautySum(s));
    }
}
