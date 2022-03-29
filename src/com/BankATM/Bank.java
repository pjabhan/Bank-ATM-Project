package com.BankATM;

import java.util.Scanner;

public class Bank {
	public static void main(String args[]) {
		BankDetails bank=new BankDetails(121233, "Pooja");
		bank.userMenu();
	}
	}

	class BankDetails {

		int balance;
		String customerName;
		int customerId;
		int previousTransaction;

		void deposit(int amount) {
			if (amount != 0) {
				balance = amount + balance;
				previousTransaction = amount;

			}
		}

		void withdraw(int amount) {
			if (amount != 0) {
				balance = balance - amount;
				previousTransaction = -amount;

			}

		}

		void getpreviousTransaction() {
			if (previousTransaction > 0) {
				System.out.println("deposited" + previousTransaction);}
				else if (previousTransaction < 0) {
					System.out.println("withdrawm" + Math.abs(previousTransaction));
				}
					else 
						System.out.println("no previous transaction occured");
				}
			


		public BankDetails(int customerId, String name) {
			this.customerId = customerId;
			this.customerName = name;
		}

		void userMenu() {
			System.out.println("Welcome" + customerName);
			System.out.println("Your id is" + customerId);

			System.out.println("A . deposit");
			System.out.println("B . withdraw");
			System.out.println("C . check balance");
			System.out.println("D . check previous transaction");
			System.out.println("E. exit");
			char option;

			do {

				Scanner sc = new Scanner(System.in);

				System.out.println("Enter the option");
				char option1 = sc.next().charAt(0);
				option=Character.toUpperCase(option1);
				switch (option) {
				case 'A':
					System.out.println("Enter the amount you want to deposit");
					int amount = sc.nextInt();
					deposit(amount);
					System.out.println("you deposited " + balance);
					System.out.println("your totla balance is " + balance);
					break;
				case 'B':
					System.out.println("Enter the amount you want to withdraw");
					int amount2 = sc.nextInt();
					withdraw(amount2);
					System.out.println("Your made a withdraw of " + amount2 + "now your total amount left is " + balance);
				    break;
				case 'C':
					System.out.println("Your balance is " + balance);
					break;
				case 'D':
					getpreviousTransaction();
					break;

				case 'E':

					System.out.println("*******");
					break;
				default :
					System.out.println("invalid input");
				}

			} while (option != 'E');
			System.out.println("thank you for using our service");

		}

	
}
