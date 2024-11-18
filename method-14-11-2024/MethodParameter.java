package pack;
import java.util.*;
public class MethodParameter {

	static void  method(String fname) {
		System.out.println(fname);
		
	}
	static int mymethod(int a) 
	{
//		System.out.println(a);
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method("sanjai");
		method("sam");
		method("sanal");
//		mymethod(30);
		int b=mymethod(30);
		System.out.println(b);

	}

}
