package pack;

import java.util.Scanner;

public class SubractArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		int arr2[][]=new int[n][n];
		
		int arr3[][]=new int[n][n];
		System.out.println("Enter the elements of Array 1");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Enter the elements of array 2");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr2[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				arr3[i][j]=arr[i][j]-arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
			
		}
		

	}

}
