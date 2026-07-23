/*
Create a class that implements a stack with the following methods :
1> push(value:string)
2> pop()
3> evaluate()
*/

import java.util.Scanner;
class Stack{
	int data;
	Stack next;
	Stack(int data){
	this.data = data;
	this.next = null;
	}
}

public class TcsQue8{
	static Stack top = null;

	public static int evaluate(String exp){

		String [] str = exp.split(" ");
		for(int i=0;i<str.length;i++){
			String s = str[i];
			
			if(s.equals("+")){
				int a = pop();
				int b = pop();
				push(b+a);
			}
			else if(s.equals("-")){
				int a = pop();
				int b = pop();
				push(b-a);
			}else if(s.equals("*")){
				int a = pop();
				int b = pop();
				push(b*a);
			}else if(s.equals("/")){
				int a = pop();
				int b = pop();
				push(b/a);
			}else{
				push(Integer.parseInt(s));
			}
		}
		return pop();
	}
	
	public static int pop(){
		if(top == null){ 
			return -1;
		}
		int value = top.data;
		top = top.next;
		return value;
	}
	
	public static void push(int n){
		Stack newNode = new Stack(n);
		newNode.next = top;
		top = newNode;
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter expresion : "); // 15 2 * 3 + 7 -
		String exp = sc.nextLine();
		int ans = evaluate(exp); 
		System.out.println("result : "+ans); // result : 26
		sc.close();
	}
}
