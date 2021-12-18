package application;

import java.util.Scanner;

public class Begin {
	Manager m1;
	Employee e1;
	Scanner sc = new Scanner(System.in);
	public Begin()
	{
		init();
	}
	void init()
	{
		this.m1 = new Manager();
		this.e1 = new Employee();
		
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Begin b = new Begin();
		boolean running  = true;
		while(running)
		{
			System.out.println("Who Are you using ?\n1. Manager\n2. Employee");
			int choice = b.sc.nextInt();
			if(choice == 1)
			{
				b.m1.Works();
			}
			else if(choice == 2)
			{
				b.e1.EmpWorks();
			}
			else if(choice  == 0)
			{
				System.out.println("Thanks for using SMS\n");
				running = false;
						
			}
				
				
		}
	}

}
