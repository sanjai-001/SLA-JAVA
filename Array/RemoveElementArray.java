package pack;
import java.util.*;
public class RemoveElementArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Which number do you delete ");
		
		int element=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]==element) {
				
				for(int j=i;j<n-1;j++) {
					arr[j]=arr[j+1];
				}
			
				break;
				
			}
			
		}
		
		System.out.println("After element remove");
		
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
