package String;

import java.util.Stack;

class MaxDepParanthesis {
    public static int maxDepth(String s) {
        int result = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                count++;
                result = Math.max(result, count);
            }else if(ch == ')'){
                count--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String  s = "()(())((()()))";
        System.out.println(maxDepth(s));
    }
}


