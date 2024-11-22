package pack;

public class WrapperClassWhole {

	public static void main(String[] args) {
		byte b=10;
		long l=123456;
		short s=4;
		double d=55.98D;
		boolean b2=true;
		float f=67.987F;
		int i=76;
		char c='a';
		
		//autoboxing: convert primitive to objects
		
		Byte byteobj=b;
		Long longobj=l;
		Short shortobj=s;
		Double doubleobj=d;
		Boolean booleanobj=b2;
		Float floatobj=f;
		Integer intobj=i;
		Character charobj=c;
		
		System.out.println("primitive to object");
		
		System.out.println(byteobj);
		System.out.println(longobj);
		System.out.println(shortobj);
		System.out.println(doubleobj);
		System.out.println(booleanobj);
		System.out.println(floatobj);
		System.out.println(intobj);
		System.out.println(charobj);
		
		
		
		//unboxing: convert objects to primitive
		
		Byte bytevalue=byteobj;
		Long longvalue=longobj;
		Short shortvalue= shortobj;
		Double doublevalue=doubleobj;
		Boolean booleanvalue=booleanobj;
		Float floatvalue=floatobj;
		Integer intvalue= intobj;
		Character charvalue= charobj;
		
		System.out.println("object to primitive");
		
		System.out.println(bytevalue);
		System.out.println(longvalue);
		System.out.println(shortvalue);
		System.out.println(doublevalue);
		System.out.println(booleanvalue);
		System.out.println(floatvalue);
		System.out.println(intvalue);
		System.out.println(charvalue);


		

	}

}
