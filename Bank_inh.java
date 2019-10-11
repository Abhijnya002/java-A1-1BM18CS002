import java.util.*;
class Account
{
	double balance;
	double deposit;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the name and account number=");
		String name=sc.next();
		String num=sc.next();
		
	}
	void deposit()
	{
		System.out.println("Enter the balance and deposit=");
		
		balance=sc.nextFloat();
		deposit=sc.nextFloat();
		balance=deposit+balance;
	}
	void display()
	{
		System.out.println("balance="+balance);
		System.out.println("deposit="+deposit);
	}
}
class Savings extends Account
{
	Scanner sc=new Scanner(System.in);
	int rate ,time;
	double interest;
	void compute()
	{
		System.out.println("Enter the rate time= ");
		rate=sc.nextInt();
		time=sc.nextInt();
		interest=balance*Math.pow((1+rate/100),time);
		balance=balance+interest;
		super.display();
		
	}
	void withdraw()
	{
		System.out.println("Enter the amount to withdraw=");
		
		float with=sc.nextFloat();
		balance=balance-with;
	}
	void display()
	{
		super.display();
		System.out.println("Balance after withdrawal="+balance);
			System.out.println("interest="+interest);
	}
	
		
}
class Current extends Account
{
	Scanner sc=new Scanner(System.in);
	int min=500;
	int service=50;
	void check()
	{
		deposit();
	if(balance<min)
	{
		balance=balance-service;
	}
	}
	void display()
	{
		super.display();	
	}
}
class Bank_inh
{
	public static void main(String args[])
	{
	Account ob=new Account();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1 for Savings and 2 for current=");
	int c=sc.nextInt();
	while(c!=0)
	{
		switch(c)
		{
		case 1:Savings ref=new Savings();
			ref.input();	
			ref.deposit();
			ref.compute();
			ref.withdraw();
			ref.display();
			break;
		case 2:Current o=new Current();
			o.input();
			o.check();
			o.display();
			break;
		}
		System.out.println("enter 1 for Savings and 2 for current=");
		c=sc.nextInt();
	}
	}
}

