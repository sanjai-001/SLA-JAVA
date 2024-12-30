package pack;
import java.util.*;
public class HashmapExample {

	public static void main(String[] args) {
		
		
		Map<String,Integer> num=new HashMap<String,Integer>();
		
		//insert the elements map
		//numbers.put(1,"one");
		num.put("one", 1);
		num.put("two", 2);
		num.put("three", 3);
		System.out.println("Map"+num);
		
		HashMap<String,Integer> num2=new HashMap<String,Integer>(num);
		num2.put("four", 4);
		num2.put("five", 5);
		
		System.out.println("cloning elements"+num2);
		
		//Access key
		System.out.println("keys"+num.keySet());
		
		//Access values of the map
		System.out.println("values"+num.values());
		
		//Access Entries of the map
		System.out.println("Entires"+num.entrySet());
		
		
		//Remove Element from the map
		int value=num.remove("two");
		System.out.println("Removing"+num);
		System.out.println("Removed values"+value);
		System.out.println(num);
		num.clear();
		System.out.println(num);

	}

}
