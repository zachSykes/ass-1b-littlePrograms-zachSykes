/**
 * 
 */
package com.mycompany.ass1b.chapter4;
import java.util.Scanner;

/**
 * @author zacharysykes
 *
 */
public class Program_4_20_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		Program_4_20 employee1 = new Program_4_20(" ", 0.0, 0);
		Program_4_20 employee2 = new Program_4_20(" ", 0.0, 0);
		Program_4_20 employee3 = new Program_4_20(" ", 0.0, 0);
		
		//EMPLOYEE 1
		System.out.print("Enter Name for Employee 1: ");
		String name = input.nextLine();
		employee1.setName(name);
		
		System.out.print("Enter Pay Rate for Employee 1: ");
		double payRate = input.nextDouble();
		employee1.setPayRate(payRate);
		
		System.out.print("Enter the Amount of Hours Worked for Employee 1: ");
		int hours = input.nextInt();
		employee1.setHours(hours);
		
		employee1.pay(payRate, hours);
		
		System.out.println("Employee 1 ");
		System.out.println("-----------");
		System.out.println("Name: " + employee1.getName());
		System.out.println("Pay Rate: " + employee1.getPayRate());
		System.out.println("Hours Worked: " + employee1.getHours());
		System.out.println("Pay: $" + employee1.getPay());
		
		
		//EMPLOYEE 2
		System.out.print("Enter Name for Employee 2: ");
		name = input.next();
		employee2.setName(name);
		
		System.out.print("Enter Pay Rate for Employee 2: ");
		payRate = input.nextDouble();
		employee2.setPayRate(payRate);
		
		System.out.print("Enter the Amount of Hours Worked for Employee 2: ");
		hours = input.nextInt();
		employee2.setHours(hours);
		
		employee2.pay(payRate, hours);
		
		System.out.println("Employee 2 ");
		System.out.println("-----------");
		System.out.println("Name: " + employee2.getName());
		System.out.println("Pay Rate: " + employee2.getPayRate());
		System.out.println("Hours Worked: " + employee2.getHours());
		System.out.println("Pay: $" + employee2.getPay());
		
		
		
		//EMPLOYEE 3
		System.out.print("Enter Name for Employee 3: ");
		name = input.next();
		employee3.setName(name);
		
		System.out.print("Enter Pay Rate for Employee 3: ");
		payRate = input.nextDouble();
		employee3.setPayRate(payRate);
		
		System.out.print("Enter the Amount of Hours Worked for Employee 3: ");
		hours = input.nextInt();
		employee3.setHours(hours);
		
		employee3.pay(payRate, hours);
		
		System.out.println("Employee 3 ");
		System.out.println("-----------");
		System.out.println("Name: " + employee3.getName());
		System.out.println("Pay Rate: " + employee3.getPayRate());
		System.out.println("Hours Worked: " + employee3.getHours());
		System.out.println("Pay: $" + employee3.getPay());
		
	}

}
