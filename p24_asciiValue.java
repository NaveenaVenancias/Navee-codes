package zoho_assignment1;

import java.util.Scanner;

public class p24_asciiValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char a=sc.next().charAt(0);
		ascii_value(a);
	}
	public static void ascii_value(char x) {
		int asci=x;
		System.out.println(x+" ascii value is "+asci);
	}

}
