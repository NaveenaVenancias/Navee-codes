package zoho_assignment1;

import java.util.Scanner;

public class p25_QuotientReminder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dividend, divisor: ");
		int dividend=sc.nextInt();
		int divisor=sc.nextInt();
		method(dividend,dividend);
	}
	public static void method(int a,int b) {
		int quotient=a/b;
		int reminder=a%b;
		System.out.println("Quotient: "+quotient);
		System.out.println("Reminder: "+reminder);
	}

}
