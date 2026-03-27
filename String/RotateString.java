package String;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String ss = s + s;
        return ss.contains(goal);
    }
    public static void main(String[] args) {
        String s = "abcde" , goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }
}


