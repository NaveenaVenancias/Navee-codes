package zoho_assignment1;

import java.util.Scanner;

public class p4_BitWiseOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(a+" Bitwise AND "+b+" = "+(a&b));
		System.out.println(a+" Bitwise OR "+b+" = "+(a|b));
		System.out.println(a+" Bitwise XOR "+b+" = "+(a^b));
		System.out.println("Bitwise compliment of a: "+(~a));
	}

}
