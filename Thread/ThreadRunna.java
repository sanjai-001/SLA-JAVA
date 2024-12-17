package pack;

public class ThreadRunna implements Runnable {

	//thread is always run class not run interface
	
	
	public void run() {
		System.out.println("Thread is run successfully");
	}
	public static void main(String[] args) {
		
		Runnable sc=new ThreadRunna(); // interface object thread
		
		Thread t1=new Thread(sc,"mythread");  //passing interface object thread to runnable
		
		t1.start();
		
		String str=t1.getName();
		
		System.out.println(str);
		

	}

}
