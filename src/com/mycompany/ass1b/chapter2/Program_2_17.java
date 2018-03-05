/**
 * 
 */
package com.mycompany.ass1b.chapter2;

import java.util.Scanner;

/**
 * @author zacharysykes
 *
 */
public class Program_2_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write an application that inputs three integers from the
		user and displays the sum, average, product, smallest and largest of the numbers.
		 Use the techniques shown in Fig. 2.15. [Note: The calculation of the average 
		in this exercise should result in an integer representation of the average.
		 So, if the sum of the values is 7, the average should be 2, not 2.3333….]
		 */
		Scanner input = new Scanner(System.in);
		int x,y,z,sum, product, average;
		
		System.out.print("Enter first integer: ");
		x = input.nextInt();
		
		System.out.print("Enter second intger: ");
		y = input.nextInt();
		
		System.out.print("Enter third integer: ");
		z = input.nextInt();
		
		sum = x + y + z;
		average = sum / 3;
		product = x * y * z;
		
		
		System.out.printf("Sum is %d%n", sum);
		System.out.printf("Average is %d%n", average);
		System.out.printf("Product is %d%n", product);
		
		if (x > y && x > z)
		{
			System.out.println(x + " is the largest");
		}
		else if (y > x && y > z)
		{
			System.out.println(y + " is the largest");
		}
		else if (z > y && z > x)
		{
			System.out.println(z + " is the largest");
		}
		else if (x > z &&  y > z)
		{
			System.out.println(x + " is the largest");
		}
		else if (x > y &&  z > y)
		{
			System.out.println(x + " is the largest");
		}
		else if (y > x &&  z > x)
		{
			System.out.println(y + " is the largest");
		}
		
		
		
		if (x < y && x < z)
		{
			System.out.println(x + " is the smallest");
		}
		else if (y < x && y < z)
		{
			System.out.println(y + " is the smallest");
		}
		else if (z < y && z < x)
		{
			System.out.println(z + " is the smallest");
		}
		else if (x < z &&  y < z)
		{
			System.out.println(x + " is the smallest");
		}
		else if (x < y &&  z < y)
		{
			System.out.println(x + " is the smallest");
		}
		else if (y < x &&  z < x)
		{
			System.out.println(y + " is the smallest");
		}
		

		else
		{
			System.out.println("The three integers are equal");
		}
		
		
	}

}
