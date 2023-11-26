package apps;

import office.staff.Admin;
import office.staff.Emp;
import office.staff.Programmer;
import office.staff.SalesManager;
import office.utility.ITraveller;

public class TravellerDemo {

	public static void main(String[] args) {
		Emp [] allemps = new Emp[3];
		allemps[0] = new SalesManager("Amit", 11,11 ,1998 , 1001, 10000, 100000, 4.5, 10);
		allemps[1] = new Programmer("Bakul", 12, 12, 1997, 1002, 15000, 45.5, 879.0, 5);
		allemps[2] = new Admin("Rahul", 3, 4, 1999, 1005, 9000, 987);
		
		//this salary includes TA for SM and Pr
		for(Emp e : allemps)
			System.out.println("Salary : "+e.calSalary());

		System.out.println("***********");
		for(Emp e : allemps)
		{
			if(e instanceof ITraveller)
			{
			   System.out.print(e.getEmpid()+" : ");   //employee
			   if(e instanceof SalesManager)  //SM
				    System.out.print(((SalesManager)e).getDaysTravelled()+" : ");
			   if(e instanceof Programmer)  //Pr
				    System.out.print(((Programmer)e).getDaysTravelled()+" : "); //ITraveller
			   System.out.print(((ITraveller)e).calculateTA());
			   System.out.println();
			}
		}
		
		
	}

}
