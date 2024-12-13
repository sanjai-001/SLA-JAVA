package pack;
import java.util.*;

public class ArrayInsert{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("which position you want: ");
		int pos=sc.nextInt();
		
		System.out.println("Enter the element to insert");
		
		int insert=sc.nextInt();
		
		for(int i=(n-1);i>=(pos-1);i--) {
			
			arr[i+1]=arr[i];
			
		}
		
		arr[pos-1]=insert;
		
		System.out.println("After inserting");
		
		for(int i=0;i<n;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
		System.out.print(arr[n]);
		

	}

}
