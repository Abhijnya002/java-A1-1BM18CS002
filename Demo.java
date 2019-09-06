import java.util.*;
class Account
{
	Scanner sc=new Scanner(System.in);
	String name,number;
	float balance;
	void get()
	{
		System.out.println("enter name,no,balance=");
		name=sc.next();
		number=sc.next();
		balance=sc.nextFloat();
	}
	void display()
	{
		System.out.println("name="+name);
		System.out.println("phone number="+number);
		System.out.println("balance="+balance);
	}
}
class Savings extends Account
{
	Scanner sc=new Scanner(System.in);
	int r,t;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter interset rate and time=");
		r=sc.nextInt();
		t=sc.nextInt();
		get();
	}
	float compute()
	{
		return balance*t*r;
	}
	void output()
	{
		display();
		System.out.println("rate="+r);
		System.out.println("time="+t);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Savings s=new Savings();
		s.input();
		System.out.println("simple interset="+s.compute());
		s.output();
	}
}
