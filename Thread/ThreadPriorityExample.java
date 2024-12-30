package pack;

public class ThreadPriorityExample extends Thread{
	
	public void run()
	{
		System.out.println("Running thread priority"+Thread.currentThread()+Thread.currentThread().getPriority());
		
		}

	public static void main(String[] args) {
		
		ThreadPriorityExample sc=new ThreadPriorityExample();
		ThreadPriorityExample sc1=new ThreadPriorityExample();
		
		sc.setPriority(Thread.MAX_PRIORITY);
		sc1.setPriority(Thread.MIN_PRIORITY);
		
		sc.start();
		sc1.start();

	}

}
