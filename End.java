import java.util.*;
class End
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements to be entered=");
		int n=sc.nextInt();
		int a[]=new int[n+1];
		int i,temp;
		System.out.println("Enter the elements=");					
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(i=0;i<n;i++)
		{
			if(a[i]>a[i+1])
			{
				count++;
				temp=a[n-1];
				a[n-1]=a[i];
				a[i]=temp;
			}
		}
		System.out.println("count="+count);
	}	
}
output=
Enter the number of elements to be entered=
5
Enter the elements=
1
3
2
4
5
count=3
