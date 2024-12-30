package pack;

class printer{
	synchronized void printdocuments(String document) {
		for(int i=1;i<=5;i++) {
			System.out.println("print"+" "+document+" "+"-page"+i);	
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class SynchronizedExample3 {

	public static void main(String[] args) {
		
		printer sc=new printer();
		
		
		Thread t1=new Thread(()->
		sc.printdocuments("Document1")
		);
		
		Thread t2=new Thread(()->
		sc.printdocuments("Document2")
				);
		
		t1.start();
		t2.start();

	}

}
