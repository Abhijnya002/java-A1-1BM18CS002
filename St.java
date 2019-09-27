import java.util.*;
interface Stack
{
	void push(int ele);
	int pop();
	void display();
}
class StackTest implements Stack
{
	
	int top=-1;
	int n;
	int s[];
	StackTest()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size=");
		 n=sc.nextInt();
		s=new int[n];
	}
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
			s[++top]=ele;
		}
		s[++top]=ele;
	}
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("empty");
			return -999;
			
		}
		
		return s[(top)--];
		
		
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
		ref=new StackTest();
		int item;
		System.out.println("enter the number of ele to be pushed=");
		int no=sc.nextInt(); 
		System.out.println("enter 1 to push,2 to pop,3 to display=");
		int ch=sc.nextInt();
		while(ch!=0)
		{
		switch(ch)
		{
			case 1:System.out.println("enter the ele=");
				for(int i=0;i<no;i++)
				{
					item=sc.nextInt();
					ref.push(item);
				}
				break;
		
			case 2:	System.out.println("popped element="+ref.pop());
				break;
			
			case 3:	ref.display();
				break;
			default:break;
		}
		System.out.println("again enter 1 to push,2 to pop,3 to display=");
		 ch=sc.nextInt();
		}
	}
}