package Databank;
import java.util.*;
public  abstract class Accounts
{
	public String acc_no,name, address ;
	Scanner sc=new Scanner(System.in);
	public double bal=0.0;
	public void input()
	{
		System.out.println("enter customer name,acc no,address=");
		name=sc.next();
		acc_no=sc.next();
		address=sc.next();
	}
	public void display()
	{
		System.out.println("Balance="+bal);
	}
	public void show()
	{
		System.out.println("account holder name="+name);
		System.out.println("account number="+acc_no);
		System.out.println("address="+address);
	}
	  public abstract void withdrawal();
	public abstract void deposit();
}
