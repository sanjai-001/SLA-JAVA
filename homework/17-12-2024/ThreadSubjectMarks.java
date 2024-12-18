package pack;

import java.util.Scanner;

public class ThreadSubjectMarks extends Thread {

   
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int a = sc.nextInt();
        sc.nextLine(); 

        String[] SubjectName = new String[a];
        int[] marks = new int[a];

        System.out.println("Enter the subjects:");
        for (int i = 0; i < a; i++) {
            SubjectName[i] = sc.nextLine();
        }

        System.out.println("Enter the marks:");
        for (int i = 0; i < a; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Subject-wise marks:");
        for (int i = 0; i < a; i++) {
            System.out.println(SubjectName[i] + " mark: " + marks[i]);
        }

        double total = 0;
        for (int i = 0; i < a; i++) {
            total += marks[i];
        }

        double average = total / a;
        System.out.println("Average = " + average);
        sc.close();
    }

    public static void main(String[] args) {
        ThreadSubjectMarks thread = new ThreadSubjectMarks();
        thread.start();
    }
}
