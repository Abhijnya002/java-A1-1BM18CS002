import java.util.*;
class BookDemo
{
	String title,author;
	double price;
	int pages;
	BookDemo()
	{
		title="\0";
		author="\0";
		price=0.0;
		pages=0;
		
		
	}
	void set()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter title of the book,author name,price,no of pages=");
		title=sc.next();
		author=sc.next();	
		price=sc.nextInt();
		pages=sc.nextInt();
	}

	public String toString()
	{
		return "tile="+title+",author="+author+",price="+price+"pages="+pages;
		
	}
	void get()
	{
	System.out.println(toString());
	}
}
class Book
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter number of objects to be created=");
		n=sc.nextInt();
		BookDemo a[]=new BookDemo[n];
		for(int i=0;i<n;i++)
		{
			a[i]=new BookDemo();
		}
		for(int i=0;i<n;i++)
		{
			a[i].set();
			a[i].get();
		}
	}
}
output:
enter number of objects to be created=
2
enter title of the book,author name,price,no of pages=
grewal
xxx
100
589
tile=grewal,author=xxx,price=100.0pages=589
enter title of the book,author name,price,no of pages=
java
ray
200
490
tile=java,author=ray,price=200.0pages=490

