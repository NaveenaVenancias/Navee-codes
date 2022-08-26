package zoho_assignment1;

import java.util.Scanner;

public class p33_AlphabetOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character to check Alphabet or not: ");
		char a=sc.next().charAt(0);
		alphabet_or_not(a);
	}
	public static void alphabet_or_not(char x) {
		if((x>'a' && x<'z')||(x>'A' &&x<'Z')) {
			System.out.println(x+" is an Alphabet");
		}
		else {
			System.out.println(x+" is not an Alphabet");
		}
	}
}
