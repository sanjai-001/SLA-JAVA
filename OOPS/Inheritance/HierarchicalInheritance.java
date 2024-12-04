package pack;

class Baseclass{
	int parentnum=10;
}

class Subclass1 extends Baseclass{
	int childnum1=1;
}


class Subclass2 extends Baseclass{
	int childnum2=2;
}


class Subclass3 extends Baseclass{
	int childnum3=3;
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Subclass1 sc=new Subclass1();
		
		Subclass2 scc=new Subclass2();
		
		Subclass3 mc=new Subclass3();
		
		System.out.println("parentnum*childnum"+" "+ sc.parentnum*sc.childnum1);
		
		System.out.println("parentnum*childnum"+" "+ sc.parentnum*scc.childnum2);
		
		System.out.println("parentnum*childnum"+" "+ sc.parentnum*mc.childnum3);
		
	}

}
