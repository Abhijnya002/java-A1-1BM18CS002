import java.util.*;
class Sort
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int i,n,j,count=0;
	System.out.println("enter size=");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter array ele=");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<n-1;i++)
{
	for(j=1;j<n;j++)
	{
		 
		if(a[i]>a[j])
		{
			a[n-1]=a[j];
			System.out.println("array="+a[n-1]);
			++count;
		}
		
	}
	
	System.out.println("arra="+a[i]);
	

}	
	
	System.out.println(count);
	
}
}
