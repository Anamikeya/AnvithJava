package start;

public class Car {
	
	int NTires = 4;
	float MaxSpeed = 100;
	String Engine = "Anvith";
	
	Car(int tires, float speed, String engine)
	{
		System.out.println("Constructor call");
		this.NTires = tires;
		this.MaxSpeed = speed;
		this.Engine = engine;
	}
	Car()
	{
		System.out.println("default Constructor");
	}
	
	Car(int tires, int mn, String Name, String Engine)
	{
		for(int i = 0 ; i < 10; i++)
			System.out.println(Name + Engine);
	}
	void Move(int initialTime, int currentTime)
	{
		
		int TT = currentTime - initialTime;
		float position = MaxSpeed * TT;
		System.out.println(position);
	}
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Car BMW = new Car(4, 220, "Mecum");
		Car newCar = new Car(3, 80, "Nano");
		Car newCar1 = new Car(3, 80, "Nano","380Cx800CC");
		BMW.Move(0, 90);
		newCar.Move(0, 90);
		
	}

}
