package pack;

public class ConstructorParameterized {
	int id;
	String name;
	ConstructorParameterized(int i,String n){
		id=i;
		name=n;
//		System.out.println(id+" "+name);

	}
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		ConstructorParameterized sc=new ConstructorParameterized(1,"sanjaiii");
		sc.display();

	}

}
