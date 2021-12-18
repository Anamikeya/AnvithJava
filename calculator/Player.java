package calculator;

import java.util.Random;

public class Player {
	float x,y,z;
	String m_name;
	float Health;
	float Power;
	
	Player()
	{

		Random pos = new Random();
		this.m_name = "Guest_" + pos.nextInt(100000);
		this.x = pos.nextInt(1000);
		this.y = pos.nextInt(1000);
		this.z = pos.nextInt(1000);
		this.Health = 20;
		this.Power = 40;
	}
	
	Player(String name)
	{

		Random pos = new Random();
		this.m_name = name;
		this.x = pos.nextInt(1000);
		this.y = pos.nextInt(1000);
		this.z = pos.nextInt(1000);
		this.Health =90 ;
		this.Power = 100;
	}
	
	void start(String name)
	{
		
		
	}
	void getPosition()
	{
		System.out.println("Position = ("+x+", "+y+", "+z+")");
	}
	String getName()
	{
		return m_name;
	}
	
	void Level(String Name)
	{
		String power = " ", heal = " ";
		for(int i = 1; i < 100; i += 10)
		{
			if(i <= Health)
				heal += "#";
			else
				heal += "-";
		}
		for(int i = 1; i < 100; i += 10)
		{
			if(i <= Power)
				power += "*";
			else
				power += "-";
		}
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("| Name: "+m_name+"                                                |");
		System.out.println("| Health : "+heal+"                                             |");
		System.out.println("| power : "+power+"                                              |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("--------------------------------------------------------------------");
		
	}
	
	void Level(String Name, float h, float p)
	{
		String power = " ", heal = " ";
		for(int i = 1; i < 100; i += 10)
		{
			if(i <= h)
				heal += "#";
			else
				heal += "-";
		}
		for(int i = 1; i < 100; i += 10)
		{
			if(i <= p)
				power += "*";
			else
				power += "-";
		}
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("| Name: "+m_name+"                                                |");
		System.out.println("| Health : "+heal+"                                             |");
		System.out.println("| power : "+power+"                                              |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		System.out.println("|                                                                  |");
		
		System.out.println("--------------------------------------------------------------------");
		
	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("Anurag");
		Player p2 = new Player();
		p1.getPosition();
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		//p1.Level(p1.m_name);
		p2.Level(p2.m_name, 10, 60);
		
	}

}
