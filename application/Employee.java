package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
	public String name;
	public int ID;
	public float salary;
	public float hr_Work;
	public List<Employee> EList;
	Scanner sc =  new Scanner(System.in);
	Employee()
	{
		this.EList = new ArrayList<Employee>();
		Employee e1 = new Employee("e1", 3838, 1000f);
		Employee e2 = new Employee("e2", 3838, 1000f);
		Employee e3 = new Employee("e3", 3838, 1000f);
		Employee e4 = new Employee("e4", 3838, 1000f);
		EList.add(e1);
		EList.add(e2);
		EList.add(e3);
		EList.add(e4);
		
		
		
		
		
	}
	void CanBeFired()
	{
		System.out.println("Yes");
	}
	public Employee(String name, int ID, float salary)
	{
		this.EList = new ArrayList<Employee>();
		
		this.name = name;
		this.ID = ID;
		this.salary = salary;
	}
	int getId() {return ID;};
	String getName() { return name;}
	void setName() 
	{
		Scanner  sc = new Scanner(System.in);
		Manager.print("Your Current name "+getName() +" with ID = " + getId());
		Manager.print("Enter the newname to set");
		String newName = sc.nextLine();
		Manager.print(newName);
		this.name = newName;
		if(this.name == newName)
		{
			Manager.print("Name changed SUccessfully");
			Manager.print(newName);
		}
		else
		{
			Manager.print("Name Changing failed");
		}
		
	}
	public void showList()
	{
		
		for(int i = 0;  i  < EList.size(); i++)
		{
			System.out.print((i + 1)+". ");
			Manager.print(EList.get(i));
		}
	}
	public void work()
	{
		System.out.println("How much time do you wan t to work ?");
		int hrs  =  sc.nextInt();
		System.out.println("Go for " + hrs + " hrs now");
		hr_Work += hrs; 
	}
	public void leave()
	{
		System.out.println("How many days do you want to go home?");
		int days  =  sc.nextInt();
		System.out.println("Go for " + days + " now");
	}
	public void EmpWorks()
	{
		Employee e = new Employee();
		System.out.println("What do you want to do\n1. TO work\n2. TO take leave");
		int choice  = sc.nextInt();
		switch(choice)
		{
		case 1: 
			e.work();
			break;
		case 2:
			e.leave();
			break;
		default:
			System.out.println("Wrong input");
			break;
		
			
		}
	}
	public static void main(String[] args)
	{
		Employee e = new Employee();
		Employee e1 = new Employee("Anurag",007, 1000.0f);
	
		e.showList();
	}
	
}
