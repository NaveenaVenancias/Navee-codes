package zoho_assignment1;

import java.util.Scanner;

public class p30_LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three Number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		largestnumber(a,b,c);
	}
	public static void largestnumber(int x,int y,int z) {
		if(x>y && x>z) {
			System.out.println(x+" is the largest among three numbers");
		}
		else if(y>z && y>x) {
			System.out.println(y+" is the largest among three numbers");
		}
		else{
			System.out.println(z+" is the largest among three numbers");
		}
	}

}
