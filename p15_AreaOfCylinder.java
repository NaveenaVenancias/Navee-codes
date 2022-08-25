package zoho_assignment1;

import java.util.Scanner;

public class p15_AreaOfCylinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius and height of the cylinder: ");
		int r=sc.nextInt();
		int h=sc.nextInt();
		area(r,h);
	}
	public static void area(int a,int b) {
		System.out.println("Area of cylinder: "+((2*3.1415*a*b)+(2*3.1415*a*a)));
	}
	
}
