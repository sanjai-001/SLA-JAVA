package pack;

public  class ThreadJoinExample implements Runnable
{
	
	public void run()
	{
		Thread t=Thread.currentThread();
		System.out.println("Current Thread"+t.getName());
		
		System.out.println("Is alive?"+t.isAlive());
	}
	
	public static void main(String []args)throws Exception
	{
		Thread t=new Thread(new ThreadJoinExample());
		t.start();
		t.join(1000);
		
		System.out.println("\n Joining after 1000"+"Milliseconds\n");
		
		System.out.println("Current Thread"+t.getName());
		
		System.out.println("Is alive?"+t.isAlive());
	}
	
	
	

}
