package pack;

public class ConstructorEmployee {
	
	int id;
	String name;
	long phone_number;
	String email_id;
	String department;
	double salary;
	
	
	ConstructorEmployee(int id,
	String name,
	long phone_number,
	String email_id,
	String department,
	double salary)
	{
		
		 this.id=id;
		 this.name=name;
		 this.phone_number=phone_number;
		 this.email_id=email_id;
		 this.department=department;
		 this.salary=salary;
		
	}
	
	
	void display() {
		System.out.println("Employee Details");
		System.out.println("Id="+" "+id);
		System.out.println("Name="+" "+name);
		System.out.println("Phone_number="+" "+phone_number);
		System.out.println("Email_id="+" "+email_id);
		System.out.println("Department="+" "+department);
		System.out.println("Salary="+" "+salary);
	}
	
	

	public static void main(String[] args) {
		
		 ConstructorEmployee sc=new  ConstructorEmployee(108,"Sanjai",123456789,"sanjai@123","Engineering-IT",35000.00);
		 sc.display();

	}

}
