package zoho_assignment1;

import java.util.Scanner;

public class p18_ExpressionEvaluate1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a: ");
		int a=sc.nextInt();
		System.out.println("Enter b: ");
		int b=sc.nextInt();
		expression(a,b);
	}
	public static void expression(int a,int b) {
		int u=++a-b--;
		System.out.println("++a-b-- value is: "+u);
		int v=a%b++;
		System.out.println("a%b++ value is: "+v);
		int w=a*=b+5;
		System.out.println("a*=b+5 value is: "+w);
		int x=69>>>2;
		System.out.println("x=69>>>2 value is: "+x);
	}

}
