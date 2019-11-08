package cie;
import java.util.*;
public class Student
{
	int sem;
	String usn,name;
	public void get()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name,usn the the semester");
	name=sc.next();
	usn=sc.next();
	sem=sc.nextInt();
	}
	public void show()
	{	
		System.out.println("name"+name);
		System.out.println("usn"+usn);
		System.out.println("sem"+sem);
	}
}
