package pack;

import java.util.Scanner;
public class Enumexample {

	enum course1{JAVA,AI,MI}
	public static void main(String[] args) {
		
			
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				// course1[] pcourse=course1.values();
		        course1 []pcourse=course1.values();
		      

				for(course1 c :pcourse) {
					switch(c) {
					case JAVA:
						System.out.println("java course");
						break;
					case AI:
						System.out.println("AI course");	
						break;
					case MI:
						System.out.println("MI course");	
						break;
					}
				}
			}

		

	

}
