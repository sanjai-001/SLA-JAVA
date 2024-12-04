package pack;

class Shape
{
	public void display() {
		System.out.println("Inside Shape method");
		}
}

class Rectangle extends Shape {
	public void area() {
		System.out.println("Inside Rectangle method");
	}
	
}
class Cube extends Rectangle{
	public void volume() {
		System.out.println("Inside cube method");
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Cube sc=new Cube();
		sc.display();
		sc.area();
		sc.volume();
		
	}

}
