package Recursion;

public class StrtoInt {
    public static int MyAtoi(String str){
        int i = 0;
        int num = 0;
        int sign = 1;

        //1. ignore leading whitespace
        // "    -0b4c2"
        //      i
        while(i < str.length() && str.charAt(i)==' '){
            i = i+1;
        }

        //2. signedness
        // "      +123"
        //         i
        if(i < str.length()){
            if(str.charAt(i) == '-'){
                sign = -1;
                i = i+1;
            }else if(str.charAt(i) == '+'){
                i = i+1;
            }
        }

        // 3. conversion
        while(i < str.length() && Character.isDigit(str.charAt(i))){
            int digit = str.charAt(i) - '0'; // '6'-'0' => 6

            // 4. rounding
            //...Im.....0.....IM..
            //2,147,483,647,(2,147,483,64)
            //-2,147,483,648 (2,147,483,64) digit = 6
            if(num == Integer.MAX_VALUE / 10){
                if(sign == 1){
                    if(digit >= 7){
                        return Integer.MAX_VALUE;
                    }
                }else if(sign == -1){
                    if(digit >= 8){
                        return Integer.MIN_VALUE;
                    }
                }
            }

            // 2,147,483,647,(2,147,483,64)
            //-2,147,483,648(-2,147,483,650) digit = 6
            if(num > Integer.MAX_VALUE / 10){
                if(sign == 1){
                    return Integer.MAX_VALUE;
                }else{
                    return Integer.MIN_VALUE;
                }
            }

            num = num * 10 + digit;
            i++;
        }

        return sign * num;
    }
    public static void main(String[] args) {
        String str = "   -423";
        System.out.println(MyAtoi(str));
    }
}