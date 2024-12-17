package pack;

public class ThreadProgram extends Thread{
	
	// start = run
	public void run() {  
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		
		ThreadProgram sc=new ThreadProgram();
		
		sc.start(); //thread starts its going to run method

	}

}
