class Gen<s,t>
{
	s ob1;
	t ob2;
	Gen(s o1,t o2)
	{
		ob1=o1;
		ob2=o2;
	}
	void show()
	{
		System.out.println("type s="+ob1.getClass().getName());
		System.out.println("type t="+ob2.getClass().getName());
	}
	s getob1()
	{
		return ob1;
	}
	t getob2()
	{
		return ob2;
	}
}
class Gendemo
{
	public static void main(String args[])
	{
		Gen<Integer,String> g=new Gen<Integer,String>(10,"HELLO");
		g.show();
		int s=g.getob1();
		System.out.println("value="+s);
		String t=g.getob2();
		System.out.println("value="+t);
	}
}
