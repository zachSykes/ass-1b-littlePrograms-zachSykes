/**
 * 
 */
package com.mycompany.ass1b.chapter5;

/**
 * @author zacharysykes
 *
 */
public class Program_5_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int count;
		for (count = 1; count <= 10; count++)
		{
			if (count == 5)
			{
				break;
			}
			System.out.printf("%d ", count);
		}
		System.out.printf("%nBroke out of loop at count = %d%n", count);

	}

}
