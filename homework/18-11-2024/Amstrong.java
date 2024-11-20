package pack;
import java.util.*;
public class Amstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		temp=num;
		int rem=0,sum=0;
		while(temp>0){
			
			rem=temp%10;
			sum+=Math.pow(rem,count);
			temp=temp/10;
			
		}
		if(num==sum) {
			System.out.println("Amstrong number");
		}
		else {
			System.out.println("Not Amstrong number");
		}

	}

}

