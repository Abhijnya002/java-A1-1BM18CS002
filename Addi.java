import java.util.*;
class Addi
{

	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of rows and col of array a=");
	int row1=sc.nextInt();
	int col1=sc.nextInt();
	System.out.println("enter size of rows and col of array b=");
	int row2=sc.nextInt();
	int col2=sc.nextInt();
	int a[][]=new int[row1][col1];
	int b[][]=new int[row2][col2];
	int row=row1;
	int col=col1;
	int c[][]=new int[row][col];
	int d[][]=new int[row][col];
	int i,j;
	System.out.println("enter array ele of a=");
	for(i=0;i<row1;i++)
	{
		for(j=0;j<col1;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("enter array ele of b=");
	for(i=0;i<row2;i++)
	{
		for(j=0;j<col2;j++)
		{
			b[i][j]=sc.nextInt();
		}
	}
	
	
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	System.out.println("addeded array=");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			System.out.println(c[i][j]);
		}
	}
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			d[i][j]=a[i][j]-b[i][j];
		}
	}
	
	
	System.out.println("subtracted array=");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			System.out.println(d[i][j]);
		}
	}
}
}
	
	
