import java.util.*;
interface Queue
{
	void insert(int ele);
	int delete();
	void display();
}
class intqueue implements Queue
{
	int q[];
	int r,f;
	Scanner sc=new Scanner(System.in);
	intqueue(int size)
	{
	 r=-1;f=0;
	 q=new int[size];
	}
	public void insert(int ele)
	{
		if(r==q.length-1)
		{
			System.out.println("overflow");
			
		}
		q[++r]=ele;
	}
	public int delete()
	{
		if(f>r)
		{		
			System.out.println("underflow");
			return -1;
		}
		int item=q[f];
		f=f+1;
		return item;
	}
	public void display()
	{
		if(f>r)
		{		
			System.out.println("underflow");
		}	
		System.out.println("contents of queue=");
		for(int i=f;i<=r;i++)
		{
			System.out.println(q[i]);
		}
	}
}
class dynamicqueue implements Queue
{
	int q[];
	int r,f;
	Scanner sc=new Scanner(System.in);
	dynamicqueue(int size)
	{
	 r=-1;f=0;
	 q=new int[size];
	}
	public void insert(int ele)
	{
		if(r==q.length-1)
		{
			
			int temp[]=new int[q.length*2];
			for(int i=0;i<q.length;i++)
				temp[i]=q[i];
			q=temp;
			q[++r]=ele;
		}
		else
		q[++r]=ele;
	}
	public int delete()
	{
		if(f>r)
		{		
			System.out.println("underflow");
			return -1;
		}
		int item=q[f];
		f=f+1;
		return item;
	}
	public void display()
	{
		if(f>r)
		{		
			System.out.println("underflow");
		}	
		System.out.println("contents of queue=");
		for(int i=f;i<=r;i++)
		{
			System.out.println(q[i]);
		}
	}
}
class 	Queue_interface
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int e;
		int item,i,n1,n2,size;
		System.out.println("enter size=");
		size=sc.nextInt();
		Queue s=new intqueue(size);
		System.out.println("enter no of ele to be inserted in int queue=");
		n1=sc.nextInt();
		System.out.println("enter element in int queue=");
		for( i=0;i<n1;i++)
		{
		 item=sc.nextInt();
		s.insert(item);
		}
		s.display();
		 e=s.delete();
		System.out.println("deleted ele in int queue="+e);
		s.display();


		Queue d=new dynamicqueue(size);
		System.out.println("enter no of ele to be inserted in dynamic queue=");
		n2=sc.nextInt();
		System.out.println("enter element in dynamic queue=");
		for( i=0;i<n2;i++)
		{
		 item=sc.nextInt();
		d.insert(item);
		}
		d.display();
		 e=d.delete();
		System.out.println("deleted ele in dynamic queue="+e);
		d.display();
		
	}
}
		