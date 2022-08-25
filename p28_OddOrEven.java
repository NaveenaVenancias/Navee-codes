package zoho_assignment1;

import java.util.Scanner;

public class p28_OddOrEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a=sc.nextInt();
		oddoreven(a);
	}
	public static void oddoreven(int x) {
		if((x%2)==0) {
			System.out.println(x+ " is Even Number");
		}
		else {
			System.out.println(x+ " is Odd Number");
		}
	}

}
