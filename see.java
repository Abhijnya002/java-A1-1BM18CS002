package see;
import cie.*;
import java.util.*;
public class see extends Student
{
		public int m2[];
		int i,n;
		public void get()
		{
			Scanner sc=new Scanner(System.in);
			m2=new int[5];
			System.out.println("enter the see marks=");
			for(i=0;i<5;i++)
			{
				m2[i]=sc.nextInt();
			}
		}
		
}
