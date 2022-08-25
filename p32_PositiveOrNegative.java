package zoho_assignment1;

import java.util.Scanner;

public class p32_PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a=sc.nextInt();
		positive_or_negative(a);
	}
	public static void positive_or_negative(int x) {
		if(x>0) {
			System.out.println("This is positive number");
		}
		else if(x<0) {
			System.out.println("This is negative number");
		}
		else if(x==0) {
			System.out.println("This is not negative or positive");
		}
	}

}
