package pack;

public class CopyConstructor {
	
	int id;
	String name;
	CopyConstructor(int id,String name){
		this.id=id;
		this.name=name;
	}
	CopyConstructor(CopyConstructor obj){
		this.id=obj.id;
		this.name=obj.name;
	}
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		CopyConstructor sc=new CopyConstructor(1,"sanjai");
		sc.display();

	}

}
