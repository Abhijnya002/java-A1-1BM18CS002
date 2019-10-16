import java.util.*;
class BookDemo
{
	String title;
	double price;
	void set()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter title of the book,price=");
		title=sc.next();
		price=sc.nextInt();
	}
	void disp()
	{
	System.out.println("title of book="+title);
	System.out.println("price of book="+price);
	}
}
class Book extends BookDemo
{
	 int no_of_pages;
	void set_pages()
	{
		Scanner sc=new Scanner(System.in);
		set();
		System.out.println("enter no of pages=");
		no_of_pages=sc.nextInt();
		
	}
	void dispb()
	{
		disp();
		System.out.println(" no of pages ="+no_of_pages);
	}
	
}
class Tape extends BookDemo
{
	double playing_time;
	void set_time()
	{
		Scanner sc=new Scanner(System.in);
		set();
		System.out.println("enter playing time=");
		playing_time=sc.nextDouble();
	}
	void dispt()
	{
		disp();
		System.out.println(" playing time="+playing_time);
	}
}	
class Book_lab
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("enter number of book objects to be created=");
		n=sc.nextInt();
		System.out.println("enter number of tape objects to be created=");
		int m=sc.nextInt();
		
		
		for( i=0;i<m;i++)
		{
			Book b[]=new Book[m];
			b[i].set_pages();
			b[i].dispb();
			
		}
		for(j=0;j<n;j++)
		{
			Tape t[]=new Tape[n];
			t[i].set_time();
			t[i].dispt();
		}
	}
}