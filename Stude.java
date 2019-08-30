import java.util.*;
class stude
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int i,j;
	int r,c;
	int sum=0,avg;
	System.out.println("enter size of row and col=");
	 r=sc.nextInt();
	 c=sc.nextInt();
	int a[][]=new int[r+2][c+2];
	System.out.println("enter marks=");
	for(i=0;i<r;i++)
{
	for(j=0;j<c;j++)
{
	a[i][j]=sc.nextInt();
}
}
r=0;
for(j=0;j<c;j++)
{
sum+=a[r][j];
}
a[r][c]=sum;
avg=sum/2;
a[r][c+1]=avg;
r=1;
sum=0;
for(j=0;j<c;j++)
{
sum+=a[r][j];
}
a[r][c]=sum;
avg=sum/2;
a[r][c+1]=avg;
c=0;
sum=0;
for(i=0;i<r;i++)
{
sum+=a[i][c];
}
a[r][c]=sum;
avg=sum/2;
a[r+1][c]=avg;
c=1;
sum=0;
for(i=0;i<r;i++)
{
sum+=a[i][c];
}
a[r][c]=sum;
avg=sum/2;
a[r+1][c]=avg;
System.out.println("resultant array=");
	for(i=0;i<r+2;i++)
{
	for(j=0;j<c+2;j++)
{
	System.out.println(a[i][j]);
}
}
}
}