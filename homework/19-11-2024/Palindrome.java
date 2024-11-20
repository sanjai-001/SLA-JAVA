package pack;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String  str="";
		for(int i=name.length()-1;i>=0;i--) {
			str=str+name.charAt(i);
		}
		if(name.equals(str)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
