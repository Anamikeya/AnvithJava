package calculator;

import java.util.Scanner;

public class Calculator {
	
	private int a, b;
	public float  c = 100.07f;
	public boolean running;
	
	
	public int Add(int a, int b)
	{
		return a+b;
	}
	public int subtract(int a, int b)
	{
		return a - b;
	}
	public int multiply(int a , int b)
	{
		return a*b;
	}
	public static float devide(int a, int b)
	{
		return a/b;
	}
	
	public static void print(String value)
	{
		System.out.println(value);
	}
	
	public static void print(int value)
	{
		System.out.println(value);
	}
	
	public static void print(float value)
	{
		System.out.println(value);
	}
	
	
	public static void main(String args[])
	{
		
		Scanner sc =  new Scanner(System.in);
		Calculator obj1 = new Calculator();
		System.out.print("Enter andy two numbers ");
		System.out.println("Numbers must be Integer");
		obj1.a = sc.nextInt();
		obj1.b = sc.nextInt();
		
		print(" 1 = Add\n 2 = Subtract\n 3 = Multiply\n 4 = devide");
		int choice =sc.nextInt();
		
		if(choice == 1)
		{
			print(obj1.Add(obj1.a, obj1.b));
		}
		
		else if(choice == 2)
		{
			print(obj1.subtract(obj1.a, obj1.b));
		}

		else if(choice == 3)
		{
			print(obj1.multiply(obj1.a, obj1.b));
		}
		else if(choice  == 4)
		{
			print(devide(obj1.a, obj1.b));
		}
		else
		{
			print("invalid input");
		}
		
		//int sum = obj1.Add(obj1.a, obj1.b);
//		int sub = obj1.subtract(obj1.a, obj1.b);
//		System.out.println(obj1.multiply(obj1.a, obj1.b));
//		float div = devide(obj1.a, obj1.b);
//		System.out.println("Sum = " + sum + "\n" + "Subtract = " + sub+ "\ndevide = " + div);
		
	}
}
