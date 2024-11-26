package pack;

public class StaticVarMethod {
private static int count=0;
public static void print() {
		System.out.println(count);

	}
public static void main(String[] args) {
	 StaticVarMethod sc=new  StaticVarMethod();
	 sc.print();
	 System.out.println(count);   //to call the variable
//	 System.out.println(sc.count);   // object cloning
//}
}
}
