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
		int m=sc.nextInt();
		System.out.println("enter number of tape objects to be created=");
		 n=sc.nextInt();
			Book b[]=new Book[m];
			Tape t[]=new Tape[n];
		System.out.println("enter 1 to call book,2 to tape,3 to display book details having more than 500 page=");
		int ch=sc.nextInt();
		while(ch!=0)
		{
			switch(ch)
			{
				case 1:for( i=0;i<m;i++)
					{
						b[i]=new Book();
						b[i].set_pages();
						b[i].dispb();
					
					}
					break;
				case 3:for( i=0;i<m;i++)
					{
						if(b[i].no_of_pages>500)
						{
						System.out.println("details of book having more than 500 pages");
						System.out.println(b[i].title);
						System.out.println(b[i].price);
						}
					}
					break;
				case 2:for(j=0;j<n;j++)
					{
						t[j]=new Tape();
						t[j].set_time();
						t[j].dispt();
					}
					break;
			}
			System.out.println("enter 1 to call book,2 to tape,3 to display book details having more than 500 page=");
		ch=sc.nextInt();
		}
		
	}
}