package pack;


class first extends Thread{
	
	public void run() {
		
		for(int i=0;i<=10;i++) {
			if(i%2==0) 
			{
				System.out.println(i + "is a Even number");
				
			}
			
		}
	}
}

class Second extends Thread{
	
	public void run() {
		
		for(int i=0;i<=10;i++) {
			if(i%2!=0) {
				System.out.println(i +" "+"is a Odd number");
			}
		}
	}
}



public class ThreadEvenOdd {

	public static void main(String[] args) {
		
		first sc=new first();
		Second obj=new Second();
		
		sc.start();
		obj.start();
		

	}

}
