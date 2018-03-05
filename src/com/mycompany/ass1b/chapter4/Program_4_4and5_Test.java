/**
 * 
 */
package com.mycompany.ass1b.chapter4;

/**
 * @author zacharysykes
 *
 */
public class Program_4_4and5_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Program_4_4and5 account1 = new Program_4_4and5("Jane Green",93.5);
		Program_4_4and5 account2 = new Program_4_4and5("John Blue",72.75);
		
		System.out.printf("%s's letter grade is: %s%n",account1.getName(), account1.getLetterGrade());
		System.out.printf("%s's letter grade is: %s%n",account2.getName(), account2.getLetterGrade());
		
	}

}
