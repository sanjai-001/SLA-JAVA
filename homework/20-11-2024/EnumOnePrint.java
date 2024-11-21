package pack;

import java.util.Scanner;

public class EnumOnePrint {
	    enum course1 { JAVA, AI, MI }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a course (JAVA, AI, MI):");
	        String Input = sc.next(); 
	            course1 selectedCourse = course1.valueOf(Input);

	            switch (selectedCourse) {
	                case JAVA:
	                    System.out.println("java course");
	                    break;
	                case AI:
	                    System.out.println("AI course");
	                    break;
	                case MI:
	                    System.out.println("MI course");
	                    break;
	                default:
	                    System.out.println("Invalid course");
	            }
	        

	        
	    }
	}






