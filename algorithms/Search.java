package algorithms;


import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Search {
	private int[] data;
	static Scanner sc;
	boolean find = false;
	Search()
	{
		Random rand = new Random();
		data = new int[100];
		for(int i  = 0; i < 10; i++)
			data[i] = rand.nextInt(100);
		sc = new Scanner(System.in);
		
	}
	
	void bubbleSort(int[] arr)
	{
		for(int i = 0; i < 10; ++i )
		{
			for(int j = i+1;j < 10; ++j)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
				
		}
	}
	
	void binarySearch(int[] arr, int x)
	{
		for(int i = 0; i < 10; ++i)
		{
			
		}
	}
	int LinearSearch(int x)
	{
		int index = 0;
		for(int i = 0;i < 10; ++i)
		{
			if(x == data[i])
			{
				find = true;
				index = i;
			}
			else
			{
				continue;
			}
		}
		return index;
	}
	
	
	public void Print()
	{
		for(int i = 0; i < 10; ++i)
			System.out.println(data[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search s1 = new Search();
		Random rand = new Random();
		s1.Print();
		System.out.println("Sorted : ");
		s1.bubbleSort(s1.data);
		s1.Print();
		
		
	}

}
