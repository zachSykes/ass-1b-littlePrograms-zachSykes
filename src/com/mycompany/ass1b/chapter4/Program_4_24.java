/**
 * 
 */
package com.mycompany.ass1b.chapter4;
import java.util.Scanner;

/**
 * @author zacharysykes
 *
 */
public class Program_4_24
{
	/*
	 * Modify the program in Fig. 4.12 to validate 
	 * its inputs. For any input,if the value 
	 * entered is other than 1 or 2, keep 
	 * looping until the user enters a correct value.
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		int result;
		
		while (studentCounter <= 10)
		{
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			result = input.nextInt();
			
			
		    if (result == 1)
			{
				passes = passes + 1;
				studentCounter = studentCounter + 1;
			}
			else if (result == 2)
			{
				failures = failures + 1; 
				studentCounter = studentCounter + 1;
			}
			else
			{
				System.out.println("Please only enter either 1 or 2");
			}
		}
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		if (passes > 8)
		{
			System.out.println("Bonus to instructor!");
		}
	}
}
