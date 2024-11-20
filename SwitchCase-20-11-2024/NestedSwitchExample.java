package pack;
import java.util.*;
public class NestedSwitchExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String course="java";
		switch(course){
		case "python":
			System.out.println("python is simple coding language");
			break;
		case "java":
			System.out.println("what version are u using");	
			
			int version=sc.nextInt();
			switch(version) {
			
			case 6:
				System.out.println("good version");
				break;
			case 7:
				System.out.println("nice best version");
				break;
				
			
			}
			break;
			
			
		}
	}

}
