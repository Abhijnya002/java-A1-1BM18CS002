import java.util.*;
abstract class Shape
{
	int r,h;
	Scanner sc=new Scanner(System.in);	
	void getr()
	{
	System.out.println("enter r=");
		r=sc.nextInt();
		
	}
	void geth()
	{
		System.out.println("enter h=");
		h=sc.nextInt();	
	}
	abstract void area();
	abstract void volume();
}
class Cyli extends Shape
{
	
	void area()
	{
		System.out.println("surface area of cylinder="+(2*3.14*r*h));
	}
	void volume()
	{
		System.out.println("volume of cylinder="+(2*3.14*r*h +3.14*Math.pow(r,2) ));
	}
}
class Cone extends Shape
{
	void area()
	{
		System.out.println("surface area of cone="+3.14*r*(r+Math.sqrt(Math.pow(h,2)+Math.pow(r,2))));
	}
	void volume()
	{
		System.out.println("volume of cone="+((3.14*Math.pow(r,2)*h)/3) );
	}
}
class Sphere extends Shape
{
	void area()
	{
		System.out.println(" area of sphere="+ ( 4*3.14*Math.pow(r,2 )));
	}
	void volume()
	{
		System.out.println("volume of sphere="+( (4/3)*3.14*Math.pow(r,3))  );
	}
	
}
class Shape_lab
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Shape ob=null;
		System.out.println("enter 1.cyli\n2.cone\n3.sphere=");
		int ch=sc.nextInt();
		if(ch==1)
		{
			ob=new Cyli();
			ob.getr();
			ob.geth();
			ob.area();
			ob.volume();
		}
		else if(ch==2)
		{
			ob=new Cone();
			ob.getr();
			ob.geth();
			ob.area();
			ob.volume();
		}
		else if(ch==3)
		{
			ob=new Sphere();
			ob.geth();
			ob.getr();
			ob.area();
			ob.volume();
		}
	}
}