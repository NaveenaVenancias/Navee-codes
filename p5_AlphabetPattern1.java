package zoho_assignment1;

import java.util.Scanner;

public class p5_AlphabetPattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character(A-Z):");
		char c=sc.next().charAt(0);
		int ch=c;
		
		for(int i=ch;i>=65;i--) {
			for(int j=65;j<=i;j++) {
				System.out.print((char)(i));
			}
			System.out.println();
		}
	}

}
