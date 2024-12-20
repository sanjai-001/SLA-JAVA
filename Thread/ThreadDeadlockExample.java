package pack;

public class ThreadDeadlockExample {
	
	private final String name;
	
	public ThreadDeadlockExample(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public synchronized void call(ThreadDeadlockExample caller) {
		
		System.out.println(this.getName()+"has asked to call me"+ caller.getName());
		
		try {
			Thread.sleep(1000);
		}
		
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		caller.callMe(this);
	}
	
	//deadlock for 2 generated methods but lock on objects
	
	//caller1 & caller2 forcing to wait for each other
	
	// to unlock such locks .this would trigger and
	
	// prevent callMe() function from being called.
	
public synchronized void callMe(ThreadDeadlockExample caller) {
		
		System.out.println(this.getName()+"has  called me"+ caller.getName());
}
	
	

	public static void main(String[] args) {
		
		ThreadDeadlockExample caller1=new ThreadDeadlockExample("caller-1");
		
		
		ThreadDeadlockExample caller2=new ThreadDeadlockExample("caller-2");
		
		
		new Thread(new Runnable() {
			public void run() {
				
				caller1.call(caller2);
	}}).start();
		
		
		new Thread(new Runnable()
				{
			public void run() {
				caller2.call(caller1);
			}}).start();
		

	}

}
