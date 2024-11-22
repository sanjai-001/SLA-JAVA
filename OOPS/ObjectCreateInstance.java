package pack;

public class ObjectCreateInstance
{
	String str="hello";

	public static void main(String[] args) 
	{
		
		try
		{
			//create object by using newInstance
			ObjectCreateInstance sc= ObjectCreateInstance.class.newInstance();  
			System.out.println(sc.str);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		

	}

}
