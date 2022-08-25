package zoho_assignment1;

import java.util.Scanner;

public class p27_SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a: ");
		int a=sc.nextInt();
		System.out.println("Enter b: ");
		int b=sc.nextInt();
		swap(a,b);
	}
	public static void swap(int x,int y){
		int z=x;
		x=y;
		y=z;
		System.out.println("Value of a: "+x);
		System.out.println("Value of b: "+y);
	}

}
