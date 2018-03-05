/**
 * 
 */
package com.mycompany.ass1b.chapter2;

import java.util.Scanner;

/**
 * @author zacharysykes
 *
 */
public class Program_2_16 
{
/*
 * 	Write an application that asks the user to enter two integers, obtains
	them from the user and displays the larger number followed by the words "is larger". 
	If the numbers are equal, print the message "These numbers are equal".
 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x,y;
		
		System.out.print("Enter first integer: ");
		x = input.nextInt();
		
		System.out.print("Enter second intger: ");
		y = input.nextInt();
		
		if (x > y)
		{
			System.out.println(x + " is larger");
		}
		else if (x < y)
		{
			System.out.println(y + " is larger");
		}
		else
		{
			System.out.println("These numbers are equal");
		}
	}
}
