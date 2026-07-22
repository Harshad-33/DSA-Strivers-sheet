package TCS;
/*
There are two items A and B with their respectivev prices.
write a program to determine which item is more expensive.
Condition:
1) if either price is less than 0 , Print "Invalid input";
2) if both the prices are equal print "price equal";
3) Otherwise , print the higher price followed by "is more expensive";
*/
import java.util.Scanner;
public class TcsQue7{
	public static String MoreExpensiveItem(int a , int b){
		if(a < 0 || b < 0) return "Invalid input";
		if(a > b ){
			return String.format("%d",a)+" is more expensive";
		}else if(b > a){
			return String.format("%d",b)+" is more expensive";
		}
		return "Price equal";
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int A , B;
		System.out.print("Enter A : ");
		A = sc.nextInt();
		System.out.print("Enter B : ");
		B = sc.nextInt();
		System.out.println(MoreExpensiveItem(A,B));
	}
}