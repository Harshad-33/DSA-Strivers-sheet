package TCS;

import java.util.Scanner;
public class TcsQue10{
	public static void NthFibonaci(int num){
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b);
		for(int i=3;i<=num;i++){
			int c = a+b;
			System.out.print(" "+c);
			
			a = b;
			b = c;
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Nth : ");
		int a = sc.nextInt();
		NthFibonaci(a);
		sc.close();
	}
}