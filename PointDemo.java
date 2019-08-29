import java.util.*;
class Point
{
	private int x,y;
	Point()
	{
		x=0;y=0;
	}
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	Point(Point p)
	{
		x=p.x;
		y=p.y;
	}
	double dist(Point p)
	{
		return(Math.sqrt(Math.pow((x-p.x),2)+Math.pow((y-p.y),2)));
	}
}
class PointDemo
{
	public static void main(String args[])
{
	Point p1=new Point(6,3);
	Point p2=new Point(p1);
	Point p3=new Point(9,6);
	double dist=p1.dist(p3);
	System.out.println(dist);
}
}	