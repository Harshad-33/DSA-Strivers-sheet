package Basic_Recursion;
import java.util.Scanner;

public class FibSum {
    public int fib(int num){
        if(num == 0) return 0;
        if(num == 1) return 1; 
        return fib(num-1) + fib(num-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FibSum fs = new FibSum();
        System.out.print("Enter Num : ");
        int num = sc.nextInt();
        System.out.print("Fib Sum : "+fs.fib(num));
    }
}
