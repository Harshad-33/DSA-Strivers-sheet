package Basic_Recursion;

public class SumOfFirstN {
    public int NnumbersSum(int n){
        if(n<2){
            return 1;
        }
        return n+NnumbersSum(n-1);
    }
    public static void main(String[] args) {
        SumOfFirstN SFN = new SumOfFirstN();
        System.out.println(SFN.NnumbersSum(5));
    }
}

