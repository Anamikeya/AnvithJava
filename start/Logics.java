package start;
import java.util.Scanner;
public class Logics {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		
		
		
		boolean running = true;
		
		while(running)
		{
			System.out.println("Give two numbers : ");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("1 to add");
			System.out.println("2 to subtract");
			System.out.println("3 to multiply");
			System.out.println("4 to devide");
			System.out.println("0 to quit");
			System.out.println("5 for Average");
			Polymorphism.Print("6 to percentage\n");
			
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				if(a == 0 || b == 0)
				{
					System.out.println("You cant use 0 in devide");
					continue;
				}
				System.out.println(a/b);
				break;
			case 5:
				System.out.println((a+b)/2);
			case 0:
				Polymorphism.Print("Calculator Stopped");
				running = false;
				break;
				
			default:
				System.out.println("Wrong Input");
				return;
			}
		}
		
		
		
	}
}
