package com.gvacharya.mobileapp;

import java.util.Scanner;

import com.gvacharya.mobileapp.presentation.MobileUtility;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MobileUtility utility = new MobileUtility();

		utility.setSize(scanner);
		utility.printAllMobiles();

		int choice = 0;

		System.out.println();
		do {
			choice = utility.printMenu(scanner);
			switch (choice) {
			
			case 1 -> utility.addMobileEntity(scanner);
			case 2 -> utility.updateMobileEntry(scanner);
			case 3 -> utility.deleteMobileEntry();
			case 4 -> utility.printMobileEntry(scanner);
			case 5 -> utility.printAllMobiles();
			case 0 -> System.out.println("Bye..");
			default -> System.out.println("Invalid input!");
			}
		} while (choice != 0);
	}
}
