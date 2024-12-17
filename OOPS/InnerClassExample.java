package pack;


class Outerclass{
	int x=10;
	
	
	class Innerclass{
		int y=10;
	}
}






public class InnerClassExample {

	public static void main(String[] args) {
		
		Outerclass sc=new Outerclass();
		
		Outerclass.Innerclass scc=sc.new Innerclass();
		
		System.out.println(scc.y+sc.x);

	}

}
