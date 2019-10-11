import java.util.*;
class Student
{
	String usn, name ;
	int sem;
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name,usn,sem=");
		name=sc.next();
		usn=sc.next();
		sem=sc.nextInt();
	}
	void display()
	{
		System.out.println("name="+name+"\nusn="+usn+"\nsem="+sem);
	}
}
class Test extends Student
{
	int i,n;
	int m[],credits[];
	void get_marks()
	{
		Scanner sc=new Scanner(System.in);
		get();
		System.out.println("enter number of subjects=");
		 n=sc.nextInt();
		 m=new int[n];
		 credits=new int[n];
		System.out.println("enter the cie marks out of 50=");
		for(i=0;i<n;i++)
		{
			m[i]=sc.nextInt();
		}
		System.out.println("enter the credits=");
		for(i=0;i<n;i++)
		{
			credits[i]=sc.nextInt();
		}
	}
	void display1()
	{
		display();
	}
}
class Exam extends Test
{
	int see[];
	void get_see()
	{
		Scanner sc=new Scanner(System.in);
		get_marks();
		see=new int[n];
		System.out.println("enter the see marks out of 50=");
		for( i=0;i<n;i++)
		{
			see[i]=sc.nextInt();
		}
	}
	void display2()
	{
		display1();
	}
}
class Result extends Exam
{
	int res[];
	int k=0;
	int total=0;
	float sgpa;
	void sgpa()
	{
		Scanner sc=new Scanner(System.in);
		get_see();
		res=new int[n];
		for(i=0;i<n;i++)
		{
			res[i]=see[i]+m[i];
		}
		for(i=0;i<n;i++)
		{
				 int m=res[i];
				if(m>=90)
				{
					k+=10*credits[i];
				}	
				else if(m<90&&m>=70)
				{
					k+=9*credits[i];
				}
				else if(m<70&&m>=60)
				{
					k+=8*credits[i];
				}
				else if(m<60&&m>=50)
				{
					k+=7*credits[i];
				}
				else if(m<50&&m>=40)
				{
					k+=6*credits[i];
				}
				else
				{
					
					k+=0;
				}
			
		}
		for(i=0;i<n;i++)
		{
			total+=credits[i];
		}
		sgpa=(float)k/total;
	}
	void display3()
	{
		display2();
		System.out.println("sgpa="+sgpa);
	}
}
class StuInherit
{
	public static void main(String args[])
	{
		Result ob=new Result();
		ob.sgpa();
		ob.display3();
	}
}
