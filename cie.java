package cie;
import java.util.*;

 public class cie extends Student
{
	Scanner sc=new Scanner(System.in);
	public int m[]=new int[5];
	public void get()
	{
		super.get();
		System.out.println("enter the cie marks in 5 subjects");
		for(int i=0;i<5;i++)
		{
			m[i]=sc.nextInt();
		}
	}
	public void show()
	{
		super.show();
	}
}	
