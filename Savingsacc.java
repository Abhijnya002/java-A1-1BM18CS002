package savings;
import Databank.*;
import java.util.*;
public  class Savingsacc extends Accounts
{
	public double r,interest,with,deposit;
	public int t;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		super.input();
		System.out.println("enter the rate of interest and time");
		r=sc.nextDouble();
		t=sc.nextInt();
	}
		
	public void interestCal()
	{
		interest=bal*(Math.pow((1+(r*0.01)),t));
		bal=bal+interest;
	}
	public void display()
	{
		System.out.println("rate of Interest="+r);
		System.out.println("Interest="+interest);
		super.display();
	}
	public void withdrawal()
	{
		System.out.println("enter withdrawal account=");
		with=sc.nextDouble();
		bal=bal-with;
	}
	public void deposit()
	{
		System.out.println("enter deposit account=");
		deposit=sc.nextDouble();
		bal=bal+deposit;
	}
}