package application;

import java.util.Scanner;

public class Manager extends Employee {
	
	static void print(Employee e1)
	{
		System.out.print(e1.name + " ");
		System.out.print(e1.ID+ " ");
		System.out.print(e1.salary+ " ");
		System.out.print(e1.hr_Work+ " \n");
		
	}
	static void print(String message)
	{
		System.out.println(message);
	}
	static void print(int message)
	{
		System.out.println(message);
	}
	static void print(float message)
	{
		System.out.println(message);
	}
	static void print(double message)
	{
		System.out.println(message);
	}

	
	Employee employee;
	Scanner sc;
	Manager()
	{
		this.sc = new Scanner(System.in); 
		this.employee = new Employee();
	}
	
	void CanBeFired()
	{
		System.out.println("NO");
		System.out.println("Because I am Manager");
	}
	void Fire()
	{
		print("Which Emoployee you wanna fire");
		employee.showList();
		
		int choice = sc.nextInt();
		employee.EList.remove((choice -  1));
		Manager.print("After Fire Your List");
		employee.showList();
	}
	
	void Hire() 
	{
		print("Give Name : ");
		String name = sc.next();
		print("Give ID : ");
		int ID = sc.nextInt();
		print("Give Salary : ");
		float salary =  sc.nextFloat();
		Employee e = new Employee(name, ID, salary);
		employee.EList.add(e);
		print("After Adding employee : '"+ e.name +"' your new List" );
		employee.showList();
	}
	
	public void Works()
	{

		Manager m1= new Manager();
		print("Hello Manager");
		
		print("What do you want to do : \n1. Hire\n2. Fire\n3. Just see employees\n0. to quit");
		String choice = m1.sc.next();
		
		switch(choice)
		{
		case "1":
			m1.Hire();
			break;
		case "2":
			m1.Fire();
			break;
		case "3":
			m1.employee.showList();
			break;
		case "0":
			print("Thankyou manager!!!");
			break;
		default:
			print("Wrong Input");
			break;
				
		}
		
		
	}
	public static void main(String[] arguments)
	{
		Employee m1 = new Manager();
		Employee e1= new Employee();
		
		m1.CanBeFired();
		e1.CanBeFired();
		

	}
	
}
