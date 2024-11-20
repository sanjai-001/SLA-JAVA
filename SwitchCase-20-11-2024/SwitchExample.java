package pack;
import java.util.*;
public class SwitchExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int variable=sc.nextInt();
		switch(variable) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");	
			break;
		
		default:
			System.out.println("pls enter the correct number");
		}

	}

}
