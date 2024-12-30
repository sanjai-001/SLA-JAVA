package pack;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("sam");
		a.add("durai");
		a.add("sanjai");
		System.out.println(a);
		
		
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("sanal");
		a1.add("kumri");
		a1.add("amri");
		System.out.println(a1);
		
		//joining two array
		ArrayList<String>a2=new ArrayList<String>();
		a2.addAll(a);
		a2.addAll(a1);
		System.out.println(a2);
		
		
		//sorting
		Collections.sort(a2);
		System.out.println(a2);
		
		
		//looping through for (arraylist) to find length
		for(int i=0;i<a2.size();i++) {
			
			System.out.println(a2.get(i));
		}
		
		System.out.println("using for each loop");
		
		
		//looping through for each
		for(String i:a2) {
			System.out.println(i);
		}
		
		
		//Insert element at the beginning of the list
		a2.add(0,"surya");
		//Access an iteam
		System.out.println(a2.get(0));
		
		//changing an iteam
		System.out.println(a2.set(0,"dhanush"));
		
		
		//removing an iteam
		System.out.println(a2.remove(1));
		System.out.println("after removing the element 2");
		System.out.println(a2);
		
		//remove all the element use clear()
		a2.clear();
		System.out.println(a2);
		

	}

}
