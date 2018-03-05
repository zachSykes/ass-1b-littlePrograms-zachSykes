/**
 * 
 */
package com.mycompany.ass1b.chapter2;
import java.util.Scanner;

/**
 * @author zacharysykes
 *
 */
public class Program_2_6 
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	int x,y,z,result;
	
	System.out.print("Enter first integer: ");
	x = input.nextInt();
	
	System.out.print("Enter second intger: ");
	y = input.nextInt();
	
	System.out.print("Enter third integer: ");
	z = input.nextInt();
	
	result = x * y * z;
	
	System.out.printf("Product is %d%n", result);
}
}
