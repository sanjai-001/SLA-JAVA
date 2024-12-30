package pack;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		
//it implements global array of objects 
//it will grow and 
		//synchronized
		
		
		Vector<Integer> v=new Vector<Integer>();
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		System.out.println("the vector element is"+v);
		
		//insert an element at (value,index)
		v.insertElementAt(0,1);
		System.out.println("the vector element is"+v);
		
		
		//remove the element at the index
		v.removeElementAt(2);
		//displaying the first element
		System.out.println("the vector element is"+v.firstElement());
		
		
		//print the element of the vector
		for(int i:v) {
			
			System.out.println(i);
			
		}
		

	}

}
