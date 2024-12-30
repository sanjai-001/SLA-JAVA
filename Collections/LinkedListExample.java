package pack;
import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer>arr=new LinkedList<>();
		
		LinkedList<Integer>arr1=new LinkedList<>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr1.add(5);
		arr1.add(6);
		arr.remove(2);
		System.out.println(arr);
		
		for(int i:arr) {
			System.out.println(i);
		}
		
		
		Collections.sort(arr);
		System.out.println(arr);
		
		Collections.reverse(arr);
		System.out.println(arr);
		
		
		Collections.shuffle(arr);
		System.out.println(arr);
		
		arr.isEmpty();
		System.out.println(arr);
		
		
		arr.addAll(arr);
		System.out.println(arr);
		
		
		arr.remove(1);
		arr.removeLast();
		System.out.println("remove first element"+arr);
		

	}

}
