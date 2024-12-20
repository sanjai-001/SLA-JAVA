package pack;

 class MultiThreadningDemos extends Thread {
	
	public void run()
	{
		try {
			System.out.println("Thread"+Thread.currentThread().getName()+"is running");
		}
		catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}
	
}

public class MultiThreadningExample{
	


	public static void main(String[] args) {
		
		int n=8;
		
		for(int i=0;i<n;i++) {
			MultiThreadningDemos sc=new MultiThreadningDemos();
			sc.start();
			
		}

	}

}
