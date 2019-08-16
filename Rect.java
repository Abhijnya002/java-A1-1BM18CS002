import java.util.*;
class A
{
	int length;
	int breadth;
	int a;
	void set()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length and breadth=");
		length=sc.nextInt();
		breadth=sc.nextInt();
	
	}
	void area()
	{
		a=length*breadth;
		
	}
	void display()
	{
		System.out.println("length="+length);
		System.out.println("breadth="+breadth);
		System.out.println("area="+a);	
		
}
}
class Rect
{

	public static void main(String args[])
{
	
	A ar=new A();
	ar.set();
	ar.area();
	ar.display();
}
}
