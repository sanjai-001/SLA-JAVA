package pack;

public class SingletonClassDesign {
	
	private String name;
	private int age;
	private String department;
	
	
	private SingletonClassDesign(String name,int age,String department) {
		
		this.name=name;
		this.age=age;
		this.department=department;
	}
	
	
	public static SingletonClassDesign createFactoryMethod(String name,int age,String department) {
		
		return new SingletonClassDesign(name,age,department);
	}
	
	
	public static void main(String[] args) 
	{
		
		SingletonClassDesign cf1=SingletonClassDesign.createFactoryMethod("sam", 87, "IT");
		
		SingletonClassDesign cf2=SingletonClassDesign.createFactoryMethod("sanal", 77, "cse");
		
		
		System.out.println("Name"+" "+cf1.name+" "+"Age"+" "+"Department"+cf1.department);
		
		
		System.out.println("Name"+" "+cf2.name+" "+"Age"+" "+"Department"+cf2.department);
		
		
		

	}

}
