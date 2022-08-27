package zoho_assignment1;

import java.util.Scanner;

public class p19_ExpressionEvaluate2 {

	public static void main(String[] args) {
		int a=28;
		int x=(a+=a++ + ++a + -a + a--);
		System.out.println("value is: "+x);
	}

}
