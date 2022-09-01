package zoho_assignment1;

import java.util.Scanner;

public class p48_NumberPattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n:");
		int n=sc.nextInt();
		for(int row=0;row<n;row++) {
			int left=n-row;
			int right=n-1;
			for(int space=row;space<=n-1;space++) {
				System.out.print("  ");
			}
			for(int leftcol=0;leftcol<=row;leftcol++) {
				System.out.print((left++)+" ");
			}
			for(int rightcol=0;rightcol<row;rightcol++) {
				System.out.print((right--)+" ");
			}
			System.out.println();
		}
	}

}
