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
class Marks extends Student
{
	int i,n,j,k,ciet=0,seet=0;
	int m[],credits[],see[];
	void get_marks()
	{
		Scanner sc=new Scanner(System.in);
		get();
		System.out.println("enter number of subjects=");
		 n=sc.nextInt();
		 m=new int[n];
		 credits=new int[n];
		see=new  int[n];
		System.out.println("enter the cie marks out of 50=");
		for(i=0;i<n;i++)
		{
			m[i]=sc.nextInt();
			ciet=ciet+m[i];
		}
		System.out.println("enter the see marks out of 50=");
		for(j=0;j<n;j++)
		{
			see[j]=sc.nextInt();
			seet=seet+see[j];
		}
		
		System.out.println("enter the credits=");
		for(k=0;k<n;k++)
		{
			credits[k]=sc.nextInt();
		}
	}
	void display1()
	{
		display();
		System.out.println("cie total="+ciet);
		System.out.println("see total="+seet);
	}
}


class Result extends Marks
{
	int res[];
	int k=0;
	int total=0;
	float sgpa;
	void grade()
	{
		Scanner sc=new Scanner(System.in);
		get_marks();
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
					k=10;
				}	
				else if(m<90&&m>=70)
				{
					k=9;
				}
				else if(m<70&&m>=60)
				{
					k=8;
				}
				else if(m<60&&m>=50)
				{
					k=7;
				}
				else if(m<50&&m>=40)
				{
					k=6;
				}
				else
				{
					
					k=0;
				}
			
		}
		
	}
	void display3()
	{
		display1();
		System.out.println("grade point="+k);
	}
}
class Stu_lab
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of  objects to be created=");
		 int n=sc.nextInt();
		int top=0,topper,i;
		Result ob[]=new Result[n];
		for( i=0;i<n;i++)
		{
			ob[i]=new Result();
			ob[i].grade();
			ob[i].display3();
		}
		for( i=0;i<n;i++)
		{
			if(ob[i].seet>ob[i].ciet)
			{
				top=i;
			}
		}
				System.out.println("who scored better in cie than see=");
				System.out.println(ob[top].name);
	}
}