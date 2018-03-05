package com.mycompany.ass1b.chapter2;

import java.util.Scanner;

public class Program_2_15 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * Write an application that asks the user to enter two integers, obtains them
			from the user and prints their sum, product, difference and quotient (division)
		 */
		
			Scanner input = new Scanner(System.in);
			int x,y,z;
			
			System.out.print("Enter first integer: ");
			x = input.nextInt();
			
			System.out.print("Enter second intger: ");
			y = input.nextInt();
			
			
			int sum = x + y;
			int product = x * y;
			int difference = x - y;
			int quotient = x / y;
			
			System.out.printf("Sum is %d%n", sum);
			System.out.printf("Product is %d%n", product);
			System.out.printf("Difference is %d%n", difference);
			System.out.printf("Quotient is %d%n", quotient);
		}

}
