package zoho_assignment1;

import java.util.Scanner;

public class p14_AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and width of the rectangle in m: ");
		int l=sc.nextInt();
		int w=sc.nextInt();
		area(l,w);
	}
	public static void area(int a,int b) {
		System.out.println("Area of Rectangle: "+(a*b));
	}
	

}
