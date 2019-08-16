import java.util.*;
class Max
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int i,j;
	System.out.println("enter size of row and col of array a=");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int arr[][]=new int[row][col];
	System.out.println("enter array ele of a=");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	int large=-1111;
	for(int a[]:arr)
	{
		for(int x:a)
		{
			if(x>large)
			{
				large=x;
			}
		}
	}
	System.out.println("large="+large);
}
}
