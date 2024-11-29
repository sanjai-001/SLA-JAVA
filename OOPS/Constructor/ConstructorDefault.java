package pack;

public class ConstructorDefault {
	int id;
	String name;
	 ConstructorDefault(){
		 this.id=id;
		 this.name=name;
	 }
	 void display(int id,String name) {
		 System.out.println(id+" "+name);
	 }

	public static void main(String[] args) {
		 ConstructorDefault sc=new  ConstructorDefault();
		 sc.display(1,"sanjai");

	}

}
