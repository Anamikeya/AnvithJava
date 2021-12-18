package start;

public class Polymorphism {
	private int id;
	private String name;
	private  String Intrest;
	private float aloted;
	
	Polymorphism()
	{
		Print("Defaul Constructed");
		
		
	}
	Polymorphism(int id, String n,String it, float al)
	{
		Print("Constructed");
		
	}
	static void Print(String message)
	{
		System.out.println(message);
	}
	static void Print(int message)
	{
		System.out.println(message);
	}
	static void Print(float message)
	{
		System.out.println(message);
	}
	 static void Print(double message)
	{
		System.out.println(message);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism p1 = new Polymorphism(12,"dasda", "dassfda", 8.009f);
		Print(12);
		Print("is a number");
		Print(12.009f);
		Print(1221323.08998);

	}

}
