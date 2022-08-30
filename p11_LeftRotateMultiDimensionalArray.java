package zoho_assignment1;

import java.util.Scanner;

public class p11_LeftRotateMultiDimensionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int array[][]=new int[r][c];
		System.out.println("Enter the elements:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		
		int temp=array[0][0];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(j!=c-1) {
					array[i][j]=array[i][j+1];
				}
				else if(i!=j) {
					array[i][j]=array[i+1][0];
				}
			}
		}
		
		array[r-1][c-1]=temp;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
