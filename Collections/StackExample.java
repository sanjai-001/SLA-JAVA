package pack;
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer>s1=new Stack<>();
		
		//push()pushing the element from the top of the stack
		s1.push(1);
		s1.push(2);
		s1.push(3);
		System.out.println("the stack is "+" "+s1);
		
		
		//peek()display the element from the top of the stack
		System.out.println(s1.peek());
		
		
		//search the elements in the stack 
		int sear=s1.search(1);
		//print the index position....
		System.out.println("the stack search"+sear);
		
		
		//isEmpty() it returns true when nothing in the top of stock
		while(!s1.isEmpty())
		{
			
			//pop()to remove the element from the top of the stack.
			System.out.println(s1.pop());
		}



	}

}
