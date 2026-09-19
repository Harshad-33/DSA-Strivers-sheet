package Basic_Recursion;

public class PrintNumbers{
    static  int i = 1;
    public void printoneToN(int n){
        if(i>n){
            return ;
        }
        System.out.println(i);
        i++;
        printoneToN(n);
    }
    public static void main(String[] args) {
        PrintNumbers pn = new PrintNumbers();
        int n = 5;
        pn.printoneToN(n);
    }
}
