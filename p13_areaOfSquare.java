package zoho_assignment1;

import java.util.Scanner;

public class p13_areaOfSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of the square in m: ");
		int a=sc.nextInt();
		area(a);
	}
	public static void area(int a) {
		System.out.println("Area of Square: "+(a*a));
	}

}
