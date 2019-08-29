import java.util.*;
class Array
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int i,j;
	float d=0,temp;
	float a[][]=new	float[2][2];
	System.out.println("enter array ele=");
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			 d=a[0][0]*a[1][1]-a[0][1]*a[1][0];
		}
	}
	System.out.println("determinant="+d);
		temp = a[0][0];
		a[0][0] = a[1][1];
		a[1][1] = temp;
		
		a[0][1] = - a[0][1];
		a[1][0] = - a[1][0];
		if(d==0)
		{
			System.out.print("inverse does not exist");

		}
		else
		{
		System.out.println("\nInverse of matrix is:");
		for(i = 0; i < 2; ++i) {
			for(j = 0; j < 2; ++j)
				System.out.print((a[i][j]/d) + " ");
			System.out.print("\n");
		}
		}
	}
}