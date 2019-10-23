import java.util.*;
class Father
{
	Father()
	{
		try
		{
		
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("enter father age=");
		age=sc.nextInt();
			if(age<0)
			{
			throw new WrongageException("invalid:Father's age is less than 0 ");
			}
			System.out.println("valid father's age");
		}
		catch( WrongageException e)
		{
			System.out.println(e);
		}
		
	}
}
class Son extends Father
{
		Scanner sc=new Scanner(System.in);
		int Fage,Sage;
		Son()
		{
		System.out.println("enter father age,son age=");
		Fage=sc.nextInt();
		Sage=sc.nextInt();
		try
		{
			if(Sage>=Fage)
			{
			throw new WrongageException("invalid:father's age less than son's age");
			}
			System.out.println("valid father and son's age");
		}
		catch( WrongageException e)
		{
			System.out.println(e);
		}
		
		}
		
}
class  WrongageException extends Exception
{
	String details;
	 WrongageException(String s)
	{
		details=s;
	}
	public String toString()
	{
		return details;
	}
}
class ExcepHandling
{
	public static void main(String args[])
	{
		try
		{
			Son f=new Son();
		}
		catch( Exception e1)
		{
			System.out.println("caught="+e1);
		}
		
			
			
	}
}
	