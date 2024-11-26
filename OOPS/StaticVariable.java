package pack;

public class StaticVariable {
	
	static int cube(int a) {
		return a*a*a;
	}

			public static void main(String[] args) {
				int result=StaticVariable.cube(7);
				System.out.println(result);

	}

}
