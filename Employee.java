import java.util.*;
class Employee
{
	String no;
	String name;
	double basic,da,it,net;
	void set()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee number,name,basic salary=");
		no=sc.next();
		name=sc.next();
		basic=sc.nextDouble();
	}
	void compute()
	{
		da=0.75*basic;
		it=0.30*basic;
		net=basic+da-it;
	}
	void display()
	{
		
		System.out.println("no="+no);
		System.out.println("name="+name);
		System.out.println("net salary="+net);
	}
}
class EmpDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		Employee emp=new Employee();
		int i;
 		System.out.println("enter the number of employees whose salary has to be calculated=");
		int n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
		emp.set();
		emp.compute();
		emp.display();
		}
	}
}

