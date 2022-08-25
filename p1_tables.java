package zoho_assignment1;

import java.util.Scanner;

public class p1_tables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to print the table: ");
		int n=sc.nextInt();
		multiplication(n);
		subtraction(n);
	}
	
	public static void multiplication(int n) {
		System.out.println("Multiplication Table");
		for(int i=1;i<=20;i++) {
			System.out.println(i + " * "+n+" = "+ (i*n));
		}
	}
	
	public static void subtraction(int n) {
		System.out.println("Subtraction table");
		for(int i=1;i<=20;i++) {
			System.out.println(i + " - "+n+" = "+(i-n));
		}
	}
	
		
}
