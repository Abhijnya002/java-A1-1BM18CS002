import java.util.*;
class Personal
{
	String name, dept;
	int age;
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name ,dept,age=");
		name=sc.next();
		dept=sc.next();
		age=sc.nextInt();
	}
	void disp()
	{
		System.out.println("name="+name+"dept="+dept+"age="+age);
	}
}
class Student extends Personal
{
	float cgpa;
	void get_cgpa()
	{
		get();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter cgpa=");
		cgpa=sc.nextFloat();
	}
	void disp()
	{
		super.disp();
		System.out.println("cgpa="+cgpa);
	}
}
class Faculty extends Personal
{
	int no_pub;
	void get_no()
	{
		get();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of publications=");
		no_pub=sc.nextInt();
	}
	void disp()
	{
		super.disp();
		System.out.println("no of publications="+no_pub);
	}
}
class Facultydemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("enter number of student objects to be created=");
		int m=sc.nextInt();
		System.out.println("enter number of faculty objects to be created=");
		 n=sc.nextInt();
		int small=1000,large=-111;
		int top=0,top1=0;
		Student s[]=new Student[m];
		Faculty f[]=new Faculty[n];
		for( i=0;i<m;i++)
		{
			s[i]=new Student();
			s[i].get_cgpa();
			s[i].disp();
					
		}
		for( i=0;i<n;i++)
		{
			f[i]=new Faculty();
			f[i].get_no();
			f[i].disp();
					
		}
		for( i=0;i<m;i++)
		{
			
			if(s[i].age<small)
			{
				small=s[i].age;
				top=i;
				
			}
			
		}
		System.out.println("name of youngest student="+s[top].name);
		for( i=0;i<n;i++)
		{
			if(f[i].no_pub>large)
			{
				large=f[i].no_pub;
				top1=i;
			}
		}
		System.out.println("name of faculty  with maximum number of publications="+f[top1].name);
	}
} 