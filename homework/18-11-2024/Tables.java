package pack;
import java.util.*;
public class Tables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("which table you want:");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}

	}

}
