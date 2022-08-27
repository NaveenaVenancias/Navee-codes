package zoho_assignment1;

import java.util.Scanner;

public class p20_ExpressionEvaluate3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x: ");
		int x=sc.nextInt();
		expression(x);
	}
	public static void expression(int x) {
		x=x++*2+3*-x;
		System.out.println("Value is: "+x);
	}

}
