package com.skilldistillery.makechange;

public class MakeChange {

	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);

		pricePrompt();
		double itemCost = kb.nextDouble();
		moneyReceived();
		double amountReceived = kb.nextDouble();
		double moneyBack = (amountReceived - itemCost);

		if (moneyBack == 0) {
			System.out.println("Customer provided exact change.");
		} else if (moneyBack < 0) {
			System.out.println("Customer did not provide enough money.");
		} else {
			if (moneyBack >= 10) {
				int tensNeeded = (int) (moneyBack / 10);
				moneyBack %= 10;
				System.out.print(tensNeeded + " ten dollar bill, ");
			}
			if (moneyBack >= 5) {
				int fivesNeeded = (int) (moneyBack / 5);
				moneyBack %= 5;
				System.out.print(fivesNeeded + " five dollar bill, ");
			}
			if (moneyBack >= 1) {
				int onesNeeded = (int) (moneyBack / 1);
				moneyBack %= 1;
				System.out.print(onesNeeded);
				
				if (onesNeeded == 1) {
					System.out.print(" one dollar bill, ");
				} 
				else {
					System.out.print(" one dollar bills, ");
				}
			}
			if (moneyBack >= .25) {
				int quartersNeeded = (int) (moneyBack / .25);
				moneyBack %= .25;
				System.out.print(quartersNeeded);
				
				if (quartersNeeded == 1) {
					System.out.print(" quarter, ");
				} 
				else {
					System.out.print(" quarters, ");
				}
			}
			if (moneyBack >= .10) {
				int dimesNeeded = (int) (moneyBack / .10);
				moneyBack %= .10;
				System.out.print(dimesNeeded);
				
				if (dimesNeeded == 1) {
					System.out.print(" dime, ");
				} 
				else {
					System.out.print(" dimes, ");
				}
			}
			if (moneyBack >= .05) {
				int nickelsNeeded = (int) (moneyBack / .05);
				moneyBack %= .05;
				System.out.print(nickelsNeeded + " nickel, ");
			}
			if ((moneyBack +=.00005) >= .01) {
				int penniesNeeded = (int) (moneyBack / .01);
				moneyBack %= .01;
				System.out.print(penniesNeeded);
				
				if (penniesNeeded == 1) {
					System.out.print(" penny.");
				} 
				else {
					System.out.print(" pennies.");
				}
			}
		}
	

	kb.close();
	}
	

	public static void pricePrompt() {
		System.out.println("Please enter the cost of the item");
	}

	public static void moneyReceived() {
		System.out.println("Please enter the money received");
	}

}