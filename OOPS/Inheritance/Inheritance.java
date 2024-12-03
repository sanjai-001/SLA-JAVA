package pack;

 class Inheritances {
	
	public int gear;
	public int speed;
	
	Inheritances(int gear,int speed){
		this.gear=gear;
		this.speed=speed;
	}
	
	public void speedup(int increment) {
		speed+=increment;
		System.out.println("Add increment"+speed);
	}
	
	public void applybrake(int increment) {
		speed-=increment;
		System.out.println("Subract increment"+speed);
	}
	
	public String tostring() {
		return("no of gears"+gear+"\n"+"speed of bycycle"+speed);
	}
	
}

 class Mountbike extends Inheritances{
	
	
	public int seatheight;
	
	Mountbike(int gear,int speed,int starheight){
		super(gear,speed);
		seatheight=starheight;
	}
	
	public String tostring() {
		return(super.tostring()+"\n seat height"+seatheight);
	}
	
}

public class Inheritance{
	
	public static void main(String[] args) {
		Mountbike sc=new Mountbike(2,333,25);
		System.out.println(sc.tostring());
		sc.speedup(5);
		sc.applybrake(5);
		
}
		

}
