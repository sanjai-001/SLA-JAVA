package pack;
import java.util.*;
public class leap_year {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%4==0) {
			System.out.println("Leap year");
			
		}
		else {
			System.out.println("Not a Leap year");
		}

	}

}
