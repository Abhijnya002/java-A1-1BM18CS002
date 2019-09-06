import java.util.*;
class Large
{
	public static void main(String args[])
	{
		int i,a;
		int l=-1;
		for(i=0;i<args.length;i++)
		{
			a=Integer.parseInt(args[i]);
			System.out.println(args[i]);
		if(a>l)
		{
			l=a;
		}
		}
		System.out.println("large="+l);
	}
}
output=
bmsce@bmsce-Precision-T1700:~/Desktop$ javac Large.java
bmsce@bmsce-Precision-T1700:~/Desktop$ java Large 45 78 71
45
78
71
large=78

