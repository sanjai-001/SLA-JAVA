package pack;

public class CallByValueExample {
	
	int data=50;
	
	void print(int data) {
		data+=100;
	}

	public static void main(String[] args) {
		
		CallByValueExample sc=new CallByValueExample();
		
		System.out.println("Before change"+sc.data);
		
		sc.print(500);
		
		System.out.println("After change"+sc.data);

	}

}
