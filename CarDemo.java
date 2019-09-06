import java.util.*;
class Car
{
	private String model,colour; 
	private int year;
	public static int total;
	Car(String model, String colour,int year)
	{
		this.model=model;
		this.colour=colour;
		this.year=year;
		total++;
	}
	static void display()
	{
		
		System.out.println("total="+total);
	}
	void output()
	{
		System.out.println("model="+model);
		System.out.println("colour="+colour);
		System.out.println("year="+year);
	}
}
class CarDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("enter the number of vehicles=");
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			
			System.out.println("enter the model,colour,year=");
			String model=sc.next();
			String colour=sc.next();
			int year=sc.nextInt();
			Car c=new Car(model,colour,year);
			c.output();
			c.display();
		}
	}
}
