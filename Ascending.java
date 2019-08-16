import java.util.*;
class Ascending
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int i,j;
	System.out.println("enter size of array=");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter array ele=");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		
	}
	int t;
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
		
			if(a[j]>a[i])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	System.out.println("sorted array=");
	for(i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
}
}
	
		
		
			
