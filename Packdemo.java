import cie.*;
import see.*;
import java.util.*;
 class Packdemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of students=");
		int n=sc.nextInt();
		cie c[]=new cie[n];
		see e[]=new see[n];
		int f[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			c[i]=new cie();
			c[i].get();
			c[i].show();
		}
		for( i=0;i<n;i++)
		{
			e[i]=new see();
			e[i].get();
		}
		for( i=0;i<5;i++)
		{
			f[i]=c[i].m[i]+e[i].m2[i];
			
		}
		System.out.println("final marks=");
		for( i=0;i<5;i++)
		{
			
			System.out.println(f[i]);
		}
		
	}
}
