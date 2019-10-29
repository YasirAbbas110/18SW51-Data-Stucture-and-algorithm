/*Write a program by creating an 'Employee' class having the
following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per
day of employee as parameter
2 - 'AddSalary()' which adds $10 to salary of the employee if it is
greater than $500.
3 - 'AddWorkHourBonus()' which adds $5 to salary of employee if
the number of hours of work per day is more than 5 hours.*/
import java.util.*;
class Employee
{
	public double salary;
	public int hpw;
	//getinfo method which gets information
	public void getInfo()
	{
		System.out.println("Enter your salary ");
		Scanner input = new Scanner(System.in);
		salary = input.nextDouble();
		System.out.println("Enter hours per week you work ");
		hpw = input.nextInt();	
	}
	public double getSalary()
	{
		return salary;
	}
	public int getWorkPerWeek()
	{
		return hpw;
	}
	public double addSalary(double s)
	{
		if(salary>500)
		{
			salary=s+10;
		}
		return salary;
	}
	public double addWorkHourBonus(double s)
	{
		if(hpw>5)
		{
			salary=s+10;
		}
		return salary;
	}
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.getInfo();
		double d = e1.getSalary();
		int s = e1.getWorkPerWeek();
		e1.addSalary(d);
		e1.addWorkHourBonus(s);
		System.out.println("Your Salary is "+e1.getSalary());
	}
}