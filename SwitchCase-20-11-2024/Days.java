package pack;
import java.util.*;
public class Days {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String day=sc.nextLine();
		switch(day) {
		case "s":
			System.out.println("Sunday");
			break;
		case "m":
			System.out.println("Monday");
			break;
		case "t":
			System.out.println("Teusday");
			break;
		case "w":
			System.out.println("Wednesday");
			break;
		case "th":
			System.out.println("Thursday");
			break;
		case "f":
			System.out.println("Friday");
			break;	
		case "sa":
			System.out.println("Saturday");
			break;	
			
		}

	}

}
