/**
 * 
 */
package com.mycompany.ass1b.chapter2;

import java.util.Scanner;

/**
 * @author zacharysykes
 *
 */
public class Program_RQ_2_7 
{
	public static void main(String[] args)
	{
		System.out.println("This program will display the result of 5.5 x 2.5 - 1.3 x 3");
		System.out.println("It will also display the result of 31.5 -1.5");
		System.out.println("And then divide the two results by eachother");
		System.out.println("---------------------------------------------");
		
		double w = 5.5;
		double x = 2.5;
		double y = 1.3;
		double z = 3;
		
		double result = w * x - y * z;
		System.out.println("The result of 5.5 x 2.5 - 1.3 x 3 = " + result);

		
		double a = 31.5;
		double b = 1.5;
		
		double result2 = a - b;
		System.out.println("The result of 31.5 - 1.5 = " + result2);
		
		double quotResult = result / result2;
		System.out.println("The result of 5.5 x 2.5 - 1.3 x 3 divded by 31.5 - 1.5 = " + quotResult);
	}

}



/*
5.5	x 2.5 - 1.3 x 3
-----------------------
31.5 - 1.5 

*/
