package Recursion;

public class CountGN {
    static long MOD = 1000000007;
    public static int CountGoodNumbers(long n){
        long even = (n+1)/2;
        long odd = (n/2);
        
        long evenways = Power(5,even);
        long oddways = Power(4,odd);

        return (int)((evenways * oddways) % MOD);
    }

    public static long Power(long base , long exp){
        long result = 1;

        while(exp > 0){
            if(exp % 2 == 1){
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            
            exp = exp/2;
        }
        return result;
    }
    public static void main(String[] args) {
        long num = 4;
        System.out.println(CountGoodNumbers(num)); // for num = 4 , output = 400
    }
}

