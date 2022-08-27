package zoho_assignment1;

import java.util.Scanner;

public class p2_PrintLettersUptoZ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting letter input: ");
		char input_letter=sc.next().charAt(0);
		for(char l=input_letter;l<='Z';l++) {
			System.out.print(l);
		}
	}

}
