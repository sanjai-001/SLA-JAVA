package pack;

public class ElseifProgram {

	public static void main(String[] args) {
		int a=10,b=20,c=7;
		if((a>b)&& (a>c)) {
			System.out.println("a is greater");
		}
		else if((b>a)&& (b>c)) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}

	}

}
