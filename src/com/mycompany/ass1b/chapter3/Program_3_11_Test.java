/**
 * 
 */
package com.mycompany.ass1b.chapter3;
import java.util.Scanner;
/**
 * @author zacharysykes
 *
 */
public class Program_3_11_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Program_3_11 account1 = new Program_3_11("Jane Green",50.00);
		Program_3_11 account2 = new Program_3_11("John Blue", -7.53);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		
		//WITHDRAW
		System.out.print("Enter withdraw amount for account1: ");
		double withdrawAmount = input.nextDouble();
		System.out.printf("%nsubtracting %.2f from account1 balance%n%n", withdrawAmount);
		account1.withdraw(withdrawAmount);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		System.out.print("Enter withdraw amount for account2: ");
		withdrawAmount = input.nextDouble();
		System.out.printf("%nsubtracting %.2f from account2 balance%n%n", withdrawAmount);
		account2.withdraw(withdrawAmount);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
	}

}
