package zoho_assignment1;

import java.util.Scanner;

public class p59_StringSubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String string=sc.next();
		System.out.println("Enter Substring: ");
		String substring=sc.next();
		int response=stringSubstring(string,substring);
		
		if(response==-1) {
			System.out.println("Sub String is not present in String");
		}
		
		else{
			System.out.println("Value presents in the index of "+response);
		}
	}
	public static int stringSubstring(String string,String substring) {
		return string.indexOf(substring);
		
	}
}
