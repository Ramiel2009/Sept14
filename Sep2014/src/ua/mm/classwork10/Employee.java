package ua.mm.classwork10;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	private String name;
	private double salary;
	private Date hireday;
	
	
	public Employee (String name, double salary,  int year, int mounth, int day){
		this.name=name;
		this.salary=salary;
		GregorianCalendar calendar = new GregorianCalendar(year, mounth-1, day);
		hireday=calendar.getTime();
		
	}
	
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public Date getHireDay(){
		return hireday;
	}
	public void raiseSalary(double byPercent){
		double raise =salary*byPercent/100;
		salary+=raise;
	}
}
