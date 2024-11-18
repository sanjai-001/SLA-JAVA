package pack;

public class MethodUsingAccess {
	
	public void display() {
		System.out.println("method using public");
	}
	public void display1(int a) {
		System.out.println("method using public throw parameter");
	
	}

	public static void main(String[] args) {
		MethodUsingAccess sc=new MethodUsingAccess();
		sc.display();
		sc.display1(5);

	}

}
