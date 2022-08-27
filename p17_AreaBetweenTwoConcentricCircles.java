package zoho_assignment1;

import java.util.Scanner;

public class p17_AreaBetweenTwoConcentricCircles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of two circles: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		area(a,b);
	}
	public static void area(int x,int y) {
		float pi=3.1415f;
		float areaofX=pi*x*x;
		float areaofY=pi*y*y;
		if(x>y) {
			System.out.println("Area Between Two Concentric Circle: "+(areaofX-areaofY));
		}
		else {
			System.out.println("Area Between Two Concentric Circle: "+(areaofY-areaofX));
		}
	}
}
