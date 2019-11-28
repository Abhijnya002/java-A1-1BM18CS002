import Databank .*;
import savings .*;
class Employee
{
	public static void main(String args[])
	{
		Savingsacc s=new Savingsacc();
		s.input();
		s.deposit();
		s.withdrawal();
		s.interestCal();
		s.show();
		s.display();
	}
}