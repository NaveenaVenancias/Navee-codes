package zoho_assignment1;

import java.util.Scanner;

public class p7_NumberPattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		numberPattern(s);
	}
	public static void numberPattern(String s) {
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(i==j) {
					System.out.print(s.charAt(i)+" ");
				}
				else if((i+j)==s.length()-1) {
					System.out.print(s.charAt(i)+" ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
