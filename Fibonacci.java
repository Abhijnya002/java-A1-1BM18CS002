import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        f(n);
    }
    static void f(int n)
    {
        int f1=0;
        int f2=1;
        int f3=0,i;
        if(n==1)
        {
            System.out.println(f1);
        }
        else if(n==2)
        {
            System.out.println(f2);
        }
        else
        {
            for(i=2;i<n;i++)
            {
                f3=f1+f2;
                f1=f2;
                f2=f3;
            }
            System.out.println(f3);
        }
    }
}
	

