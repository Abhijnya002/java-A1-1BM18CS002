import java.util.*;
abstract class Abstract
{
	protected int l,b;
	protected double area;
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter l,b=");
		l=sc.nextInt();
		b=sc.nextInt();
	}
	void dis()
	{
		System.out.println("area="+area);
	}
	abstract double compute();
}
class Tria extends Abstract
{
	double compute()
	{
		area=0.5*l*b;
		return area;
	}
}
class Rect extends Abstract
{
	double compute()
	{
		area=l*b;
		return area;
	}
}
class Demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("enter 1 for tria and 0 for rect=");
		choice=sc.nextInt();
		Abstract ref;
		if(choice==1)
		{
		ref=new Tria();
		}
		else{
		ref=new Rect();
		}
		ref.get();
		ref.compute();
		ref.dis();
	}
}
