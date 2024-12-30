package pack;


class facto{
	
	synchronized void print(int n)
	{
		int fact=n;
		while(n>1) {
			
			n--;
			fact*=n;
		}
		System.out.println(fact);
		
		
	}
}

class display1 extends Thread{
	
	facto b;
	
	display1(facto b){
		this.b=b;
	}
	
	public void run() {
		
		b.print(5);
		
	}
}


class display2 extends Thread{
	
	facto b;
	
	display2(facto b){
		this.b=b;
	}
	
	public void run() {
		
		b.print(6);
		
	}
}








public class SynchronizedExample2 {

	public static void main(String[] args) {
		
		facto sc=new facto();
		
		display1 scc=new display1(sc);
		
		display2 sccc=new display2(sc);
		
		scc.start();
		sccc.start();

	}

}
