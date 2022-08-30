package zoho_assignment1;

import java.util.Scanner;

public class p52_ReverseSentenceUsingRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence to be reversed: ");
		String s=sc.next();
		String finalSentence=reverse(s);
		System.out.println("Reversed output is: "+finalSentence);
	}
	public static String reverse(String sentence) {
		if(sentence.isEmpty()) {
			return sentence;
		}
		
		String a[]=sentence.split(" ",2);
		String first=a[0];
		String remaining;
		if(a.length==2) {
			remaining=a[1];
		}
		else {
			remaining="";
		}
		return reverse(remaining)+first+" ";
	}
}
