package pack;

public class ConstructorOverloading 
{
	int id;
	String name;
	
	ConstructorOverloading (){
		System.out.println("Default constructor");
	}
	
	ConstructorOverloading (int i, String n)
	{
		id=i;
		name=n;
	}

	public static void main(String[] args) 
	{
		ConstructorOverloading sc=new ConstructorOverloading ();
		System.out.println("Student Id"+sc.id+"\n StudentName"+sc.name);
		
		System.out.println("\n Parameterized constructor");
		
		ConstructorOverloading scc=new ConstructorOverloading (1,"sanjai");
		System.out.println("Student Id"+scc.id+"\n StudentName"+scc.name);

	}

}
