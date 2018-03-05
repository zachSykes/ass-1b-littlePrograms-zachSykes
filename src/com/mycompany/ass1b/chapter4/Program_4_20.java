/**
 * 
 */
package com.mycompany.ass1b.chapter4;


/**
 * @author zacharysykes
 *
 */
public class Program_4_20
{
	private String name;
	private int hours;
	private double payRate;
	private double pay;
	
	public Program_4_20(String name,double payRate, int hours)
	{
		this.name = name;
		this.payRate = payRate;
		
		if (hours > 0.0)
		{
			this.hours = hours;
		}
	}
	
	public void pay(double payRate, int hours)
	{
		if (hours <= 40)
		{
			pay = payRate * hours;
		}
		else
		{
			int overtimeHours = hours - 40;
			double overtimeRate = payRate * 1.5;
			pay = ((40 * payRate) + (overtimeHours * overtimeRate));

		}
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setPayRate(double payRate)
	{
		this.payRate = payRate;
	}
	
	public void setHours(int hours)
	{
		this.hours = hours;
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public double getPayRate()
	{
		return payRate;
	}
	
	public double getPay()
	{
		return pay;
	}

	/*
	 * Determines gross pay for three employees
	 * straight time for first 40 hours worked
	 * time and a half over 40
	 * given a list of employees, # of hours worked and hourly rate
	 * determine gross pay
	 * use class Scanner to input the data
	 */
	
}
