package zoho_assignment1;

import java.util.Scanner;

public class p47_NumberPattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input value: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int leftValue=1;
			for(int j=i;j<n-1;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print((leftValue++)+" ");
			}
			int rightValue=i;
			for(int j=0;j<i;j++) {
				System.out.print((rightValue--)+" ");
			}
			System.out.println();
		}
	}

}
