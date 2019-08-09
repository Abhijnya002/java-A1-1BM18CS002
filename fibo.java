import java.util.*;

class Fibo
{
	public static void main(String args[])
{
	
	
System.out.println("enter n=");
Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	F(n);

}
static void F(int n)
{
	
	
	int f1=0;
 	int f2=1;
for(int i=0;i<n;i++)
{
	int f3=f1+f2;
	f1=f2;
	f2=f3;
	System.out.println(f3);
	
}
}
}

