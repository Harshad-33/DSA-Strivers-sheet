package Basic_Recursion;

import java.util.ArrayList;

public class ReverseString1 {
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
         if (s.size() <= 1) {
            return s;
        }
        char last = s.remove(s.size() - 1);
        reverseString(s);
        s.add(0, last);
        return s;
    }
    public static void main(String[] args) {
        ReverseString1 rs = new  ReverseString1();
        ArrayList<Character> s = new ArrayList<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');
        System.out.println(rs.reverseString(s));
    }
}


