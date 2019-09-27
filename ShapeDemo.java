import java.util.*;
abstract class Shape
{
	int l,b;
	Scanner sc=new Scanner(System.in);	
	void getlb()
	{
	System.out.println("enter l,b=");
		l=sc.nextInt();
		b=sc.nextInt();
	}
	void getr()
	{
		System.out.println("enter r=");
		l=sc.nextInt();	
	}
	abstract void area();
}
class Rectangle extends Shape
{
	
	void area()
	{
		System.out.println("area of rectangle="+(l*b));
	}
}
class Triangle extends Shape
{
	void area()
	{
		System.out.println("area of triangle="+(0.5*l*b));
	}
}
class Circle extends Shape
{
	void area()
	{
		System.out.println("area of circle="+ (3.14*l*l));
	}
}
class ShapeDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Shape ob=null;
		System.out.println("enter the choic=");
		int ch=sc.nextInt();
		if(ch==1)
		{
			ob=new Rectangle();
			ob.getlb();
			ob.area();
		}
		else if(ch==2)
		{
			ob=new Triangle();
			ob.getlb();
			ob.area();
		}
		else if(ch==3)
		{
			ob=new Circle();
			ob.getr();
			ob.area();
		}
	}
}
