package pack;

public class MethodOverloading {
	
	public int display(int a, int b) {
		return(a+b);
	}
	
	public int display(int a, int b,int c) {
		return(a+b+c);
	
	}
	
//	public double display(double a, double b,double c) {
//		return(a+b+c);
//	
//	}

	public static void main(String[] args) {
		MethodOverloading sc=new MethodOverloading();
		System.out.println(sc.display(50, 60));
		System.out.println(sc.display(70, 80,90));
	}

}
