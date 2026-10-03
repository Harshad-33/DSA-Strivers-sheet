package Basic_Recursion;
import java.util.Scanner;

public class CheckPrime {
    static int i = 2;
    public boolean isPrime(int num){
        if(num < 2) return false;
        if(i*i > num){
            i = 2;
            return true;
        }
        if(num % i == 0) return false;
        i++;
        return isPrime(num);
    }
    public static void main(String[] args) {
        CheckPrime cp = new CheckPrime();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        System.out.println("Prime Status : "+cp.isPrime(num));
        sc.close();
    }
}
