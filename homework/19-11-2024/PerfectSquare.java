package pack;
import java.util.*;
public class PerfectSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean found=false;
	
		for(int i=0;i*i<=num;i++) {
			if(i*i==num) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("It is a perfect Square");
			
		}
		else {
			System.out.println("Not a perfect Square");
		}

	}

}
