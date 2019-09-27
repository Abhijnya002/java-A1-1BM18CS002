import java.util.*;
interface Stack
{
	Scanner sc=new Scanner(System.in);
	void push(int ele);
	void pop();
	void display();
}
class StackTest implements Stack
{
	
	int top=-1;
	int n;
	int s[]=new int[n];
	public void push(int ele)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size=");
	 n=sc.nextInt();
		if(top==n-1)
		{
			n=n*2;
			int temp[]=new int[n];
			for(int i=0;i<n;i++)
			{
				temp[i]=s[i];
			}
			s=temp;
		}
		s[++top]=ele;
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("empty");
			
		}
		
		int e=s[n--];
		System.out.println("deleted ele="+e);
		
		
	}
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		
		if(top==-1);
		{
			System.out.println("empty");
			
		}
		System.out.println("contents=");
		for(int i=top;i>=0;i--)
		{
			System.out.println(s[i]);
		}
	}
}
class St
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
		Stack ref=null;
		int item;
		System.out.println("enter the number of ele to be pushed=");
		int no=sc.nextInt(); 
		System.out.println("enter 1 to push,2 to pop,3 to display=");
		int ch=sc.nextInt();
		ref=new StackTest();
		if(ch==1)
		{
			System.out.println("enter the ele=");
			for(int i=0;i<no;i++)
			{
				item=sc.nextInt();
				ref.push(item);
			}
		}
		else if(ch==2)
		{
			ref.pop();
			
		}
		else if(ch==3)
		{	
			ref.display();
		}
	}
}
		
	
		
