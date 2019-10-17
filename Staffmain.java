import java.util.*;
class staff
{
    int code;
    String name;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter code: ");
        code=sc.nextInt();
        System.out.println("Enter name: ");
        name=sc.next();
    }
    void disp()
    {
        System.out.println("CODE: "+code);
        System.out.println("NAME: "+name);
    }
}
class teacher extends staff
{
    String subject;
    void getdata()
    {
        super.getdata();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter subject name:");
        subject=sc.nextLine();
    }
    void disp()
    {
        System.out.println("TEACHER DETAILS");
        super.disp();
        System.out.println("SUBJECT NAME: "+subject);
    }
}
        
class typist extends staff
{
    int speed;
    void getdata()
    {
        super.getdata();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter speed of typist");
        speed=sc.nextInt();
    }
    void disp()
    {   
        System.out.println("Typist details:");
        super.disp();
        System.out.println("SPEED: "+speed);
    }
}

class officer extends staff
{
    char grade;
    void getdata()
    {
        super.getdata();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter grade of officer");
        grade=sc.next().charAt(0);
    }
    void disp()
    {
        super.disp();
        System.out.println("GRADE: "+grade);
    }
}
      
class regular extends typist
{
    void getdata()
    {
        super.getdata();
    }
    void disp()
    {
        super.disp();
    }
}
    
class casual extends typist
{  
    int wages;
    void getdata()
    {
        super.getdata();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter daily wages");
        wages=sc.nextInt();
    }
    void disp()
    {
        super.disp();
        System.out.println("DAILY WAGE: "+wages);
            }
}

class Staffmain
{  static int count;
    public static void main(String args[])
    {
        int n,i=0,j=0;
        Scanner sc=new Scanner(System.in);
        teacher t=new teacher();
        typist ty=new typist();
        regular r[]=new regular[20];
        casual c[]=new casual[20];
        officer of=new officer();
        for(;;)
        {
            System.out.println("1.TEACHER \n2.TYPIST \n3.OFFICER\n4.EXIT");
            n=sc.nextInt();
            switch(n)
            {
                case 1:
                        t.getdata();
                        t.disp();
                        break;
                case 2:
                        for(;;)
                        {
			System.out.println("1.regular\n2.casual\n3.end");
                        int x=sc.nextInt();
                        if(x==1)
                        {   count++;
                            r[i]=new regular();
                           r[i].getdata();
			 System.out.println("REGULAR TYPIST");
                            r[i].disp();
                           i++;
                            System.out.println("Number of typist objects: "+count);
                        }
                        else if(x==2)
                        {
                            count++;
                            c[j]=new casual();
				c[j].getdata();
				j++;
                            System.out.println("CASUAL TYPIST");
                            c[j].disp();
				 System.out.println("Number of typist objects: "+count);
                        }
			else
				break;
                        
                   	 }
                       
                        break;
                case 3:
                        System.out.println("Enter number of officers");
                        int y=sc.nextInt();
                        officer o[]=new officer[y];
                        for( i=0;i<y;i++)
                        {
                            o[i]=new officer();
                            o[i].getdata();
                        }
                       System.out.println("Enter grade of officer to be searched");
                       char ch=sc.next().charAt(0);
                       System.out.println("officer with grade "+ch);
                       for( i=0;i<y;i++)
                       {
                           if(o[i].grade==ch)
                           o[i].disp();
                        }
                        break;
                case 4:System.exit(0);
            }
        }
    }
}