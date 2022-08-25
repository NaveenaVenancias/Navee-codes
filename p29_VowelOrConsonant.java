package zoho_assignment1;

import java.util.Scanner;

public class p29_VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char a=sc.next().charAt(0);
		vowel_or_consonant(a);
	}
	public static void vowel_or_consonant(char x) {
		if(x=='a' ||x=='e' || x=='i' ||x=='o' ||x=='u') {
			System.out.println(x + " is an vowel");
		}
		else {
			System.out.println(x+" is consonant");
		}
	}

}
