package pack;
import java.util.*;
public class DequeExample {

	public static void main(String[] args) {
		
		Deque<String> d=new ArrayDeque<>();    //array or linked list
		d.addFirst("1");
		d.addLast("2");
		
		String f=d.removeFirst();
		String l=d.removeLast();
		
		System.out.println("First:"+f+" "+"Last:"+l);
		
		
		
		Deque<String> d1=new LinkedList<String>();    
		d1.add("Happy New YEAR 2025");
		d1.addFirst("Head");
		d1.addLast("Tail");
		d1.push("ading using push");
		//offer add the element at the last
		d1.offer("adding at the last using offer");
		
		//add the first
		d1.offerFirst("add using First");
		for(Iterator itr=d1.iterator();itr.hasNext();) 
		{
			System.out.println(itr.next());
			
		}
		d1.removeFirst();
		d1.removeLast();
		System.out.println("Deque after removing"+"first and last"+d1);
		
		
		
		
		
		}

}
