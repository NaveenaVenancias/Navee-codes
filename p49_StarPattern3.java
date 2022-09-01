package zoho_assignment1;

import java.util.Scanner;

public class p49_StarPattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input: ");
		int n=sc.nextInt();
		for(int row=1;row<=n;row++) {
			int totalCol=n-row+1;
			for(int space=0;space<n-totalCol;space++) {
				System.out.print(" ");
			}
			for(int col=totalCol;col>=1;col--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
