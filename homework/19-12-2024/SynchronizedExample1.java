package pack;


class book{
   synchronized void print(int n){
        for(int i=1;i<=5;i++){

            try {
                System.out.println(n*i);
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
    }
}

class read extends Thread{

    
    book b;

    read(book b){
        this.b=b;
    }
    public void run(){

       b.print(10);
        
    }
    
}





class reads extends Thread{

    book b;

    reads(book b){
        this.b=b;
    }
    public void run(){

       b.print(5);
        
    }
    
}
public class SynchronizedExample1 {

	public static void main(String[] args) {
		

        book sc=new book();
       
        read scc=new read(sc);

        reads sccc=new reads(sc);

        scc.start();
        sccc.start();
		
		

	}

}
