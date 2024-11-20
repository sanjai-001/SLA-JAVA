package pack;
import java.util.*;
public class ActorSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select a hero:");
		System.out.println("1.VIJAY");
		System.out.println("2.RAJINI");
		System.out.println("3.KAMAL");
		System.out.println("Choose your choice");
		int  actor=sc.nextInt();
		switch(actor) {
		case 1:
			System.out.println("You selected Vijay");
			System.out.println("Choose a movie");
			System.out.println("1.Thupakki");
			System.out.println("2.Beast");
			System.out.println("3.Nanban");
			System.out.println("4.Sura");
			System.out.println("5.Mersal");
			System.out.println("Enter your choice");
			int vijaymovie=sc.nextInt();
			switch(vijaymovie) {
			case 1:
				System.out.println("Thupakki : blockbuster movie");
				break;
			case 2:
				System.out.println("Beast :    flop movie");
				break;
			case 3:
				System.out.println("Nanban : blockbuster movie");
				break;
			case 4:
				System.out.println("sura : flop movie");
				break;
			case 5:
				System.out.println("mersal :    blockbuster movie");	
				break;
			}
			break;
			
		case 2:
			System.out.println("You selected Rajini");
			System.out.println("Choose a movie");
			System.out.println("1.Shivaji");
			System.out.println("2.Annathe");
			System.out.println("3.Jailer");
			System.out.println("4.Linga");
			System.out.println("5.Muthu");
			System.out.println("Enter your choice");
			int rajinimovie=sc.nextInt();
			switch(rajinimovie) {
			case 1:
				System.out.println("Shivaji : blockbuster movie");
				break;
			case 2:
				System.out.println("Annathe :    flop movie");
				break;
			case 3:
				System.out.println("Jailer : blockbuster movie");
				break;
			case 4:
				System.out.println("Linga : flop movie");
				break;
			case 5:
				System.out.println("Muthu :    blockbuster movie");	
				break;
			}
			break;
			
		case 3:
			System.out.println("You selected Kamal");
			System.out.println("Choose a movie");
			System.out.println("1.Vikram");
			System.out.println("2.Indian-2");
			System.out.println("3.Virumandi");
			System.out.println("4.Thoonga vanam");
			System.out.println("5.Apoorva Sagotharargal");
			System.out.println("Enter your choice");
			int kamalmovie=sc.nextInt();
			switch(kamalmovie) {
			case 1:
				System.out.println("Vikram : blockbuster movie");
				break;
			case 2:
				System.out.println("Indian-2 :    flop movie");
				break;
			case 3:
				System.out.println("Virumandi : blockbuster movie");
				break;
			case 4:
				System.out.println("Thoonga vanam : flop movie");
				break;
			case 5:
				System.out.println("Apoorva sagotharargal :    blockbuster movie");
				break;
			}
			break;
			
			
		}
	}

}
