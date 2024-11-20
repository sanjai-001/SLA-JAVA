package pack;
import java.util.*;
public class ActressSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose a hero");
		System.out.println("1.Vijay");
		System.out.println("2.Suriya");
		System.out.println("3.Dhanush");
		System.out.println("Enter your choice");
		int actor=sc.nextInt();
		switch(actor) {
		case 1:
			System.out.println("You selected vijay");
			displayactress();
			
			System.out.println("Select Actress");
			int actress=sc.nextInt();
			switch(actress){
			case 1:
			     System.out.println("Vijay and Samantha ");
			     System.out.println("Blocbuster movie: Theri, Kaththi, Mersal");
			     break;
			case 2:
				 System.out.println("Vijay and Trisha");
				 System.out.println("Blocbuster movie: Ghilli, Thirupachi, Leo, ");
				 System.out.println("Flop movie: Aadhi");
				 break;
			case 3:
				 System.out.println("vijay and Nayanthara");
				 System.out.println("Blocbuster movie:Bigil");
				 System.out.println("Flop movie: Villu");
				 break;
				 
			}
			break;
			
			
		case 2:
			System.out.println("You selected Suriya");
			displayactress();
			
			System.out.println("Select Actress");
			int actress1=sc.nextInt();
			switch(actress1){
			case 1:
			     System.out.println("Suriya and Samantha ");
			     System.out.println("Blockbuster movie: No movies");
			     System.out.println("Flop movie: Anjaan, 24");
			     
			     break;
			case 2:
				 System.out.println("Suriya and Trisha");
				 System.out.println("Blocbuster movie: Aaru, Mounam pesiyathey, Aayutha Ezhuthu");
				 System.out.println("Flop movie: No movies");
				 break;
			case 3:
				 System.out.println("suriya and Nayanthara");
				 System.out.println("Blocbuster movie:Ghajini, Aadhavan");
				 System.out.println("Flop movie: Masu Engira Masilamani");
				 break;
				 
			}
			break;
			
		case 3:
			System.out.println("You selected Dhanush");
			displayactress();
			
			System.out.println("Select Actress");
			int actress2=sc.nextInt();
			switch(actress2){
			case 1:
			     System.out.println("Dhanush and Samantha ");
			     System.out.println("Blockbuster movie: No movies");
			     System.out.println("Flop movie: Thangamagan");
			     break;
			case 2:
				 System.out.println("Dhanush and Trisha");
				 System.out.println("Blocbuster movie: No movies");
				 System.out.println("Flop movie: Kodi");
				 break;
			case 3:
				 System.out.println("Dhanush and Nayanthara");
				 System.out.println("Blocbuster movie:Yaradi Ni Mohini");
				 System.out.println("Flop movie: No movies");
				 break;
				 
			}
			break;

			
			
		}
		
		
	}
 static void displayactress() {
	 System.out.println("Select a Actress");
	 System.out.println("1.samantha");
	 System.out.println("2.Trisha");
	 System.out.println("3.Nayanthara");
 }
}
