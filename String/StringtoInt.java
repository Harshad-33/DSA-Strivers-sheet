package String;

public class StringtoInt {
    public static int myAtoi(String s) {
        s = s.trim();
        int result = 0;
        int sign = 1;
        int i=0;

        // handle sign 
        if(i<s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-') ){
            if(s.charAt(i)=='-'){
                sign = -1;
            }
            i++;
        }

        for(;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int digit = ch - '0'; // convert character to int

                if(result > (Integer.MAX_VALUE - digit)/10){ // overflow condition check
                    return (sign == 1)?Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                result = result * 10 + digit; // adding digit to result
            }else{
                break; // stop when digit not found
            }
            
        }
        return sign * result;
    }
    public static void main(String[] args) {
        String s = " -042";
        System.out.println(myAtoi(s));
    }
}
