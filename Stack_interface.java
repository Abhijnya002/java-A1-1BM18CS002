import java.util.*;
interface intstack
{
	void push(int ele);
	int pop();
	void display();
}
class Stack implements intstack
{
	int top=-1;
	Scanner sc=new Scanner(System.in);
	int s[]=new int[10];
	public void push(int ele)
	{
		
		if(top==9)
		{
			System.out.println("overflow");
		}
		s[++top]=ele;
	}
	public int pop()
	{
		if(top==-1)
		{		
			System.out.println("underflow");
			return -1;
		}
		return s[top--];
	}
	public void display()
	{
		if(top==-1)
		{		
			System.out.println("underflow");
		}	
		System.out.println("contents of stack=");
		for(int i=top;i>=0;i--)
		{
			System.out.println(s[i]);
		}
	}
}
class Stack_interface
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		intstack s;
		s=new Stack();
		System.out.println("enter no of ele to be inserted=");
		int n=sc.nextInt();
		System.out.println("enter element=");
		for(int i=0;i<n;i++)
		{
		int item=sc.nextInt();
		s.push(item);
		}
		s.display();
		int e=s.pop();
		System.out.println("deleted ele="+e);
		s.display();
	}
}
		