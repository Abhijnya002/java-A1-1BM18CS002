import java.util.*;
interface Stack
{
	void push(int ele);
	int pop();
	void display();
}
class StackTest implements Stack
{
	Scanner sc=new Scanner(System.in);
	int top=-1;
	System.out.println("enter the size=");
	int n=sc.nextInt();
	int s[]=new int[n];
	public void push(int ele)
	{
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
		
		
	
	public int pop()
	{
		if(top==-1);
		{
			System.out.println("empty");
			return -99;
		}
			
		return s[n--];
	}
	public void display()
	{
		
		if(top==-1);
		{
			System.out.println("empty");
			return;
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
		Stack ref=null;
		int item,e;
		System.out.println("enter the number of ele to be pushed=");
		int no=sc.nextInt(); 
		System.out.println("enter 1 to push,2 to pop,3 to display=");
		int ch=sc.nextInt();
		ref=new StackTest();
		if(ch==1)
		{
			for(int i=0;i<no;i++)
			{
				item=sc.nextInt();
				ref.push(item);
			}
		}
		else if(ch==2)
		{
			e=ref.pop();
			System.out.println("deleted ele="+e);
		}
		else if(ch==3)
		{	
			ref.display();
		}
	}
}
		
	
		
