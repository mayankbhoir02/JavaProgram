package com.gvacharya.mobileapp.presentation;

//import java.util.Arrays;
import java.util.Scanner;

import com.gvacharya.mobileapp.entity.Mobile;

public class MobileUtility {

	private static int top;

	static {
		top = -1;
	}

	private Mobile[] mobiles;

	public void setSize(Scanner scanner) {
		System.out.println("Enter size of your stack: ");
		mobiles = new Mobile[scanner.nextInt()];
	}

	public void printAllMobiles() {
		for(Mobile mobile:mobiles)
			System.out.println(mobile);
	}

	public int printMenu(Scanner scanner) {
		System.out.println("Menu");
		System.out.println("1: Add Mobile Entity");
		System.out.println("2. Update Mobile Entity");
		System.out.println("3. Delete Mobile Entity");
		System.out.println("4. Show Mobile Entity");
		System.out.println("5: Show All Mobiles Entry");
		System.out.println("0. To Exit");

		return scanner.nextInt();
	}

	public void addMobileEntity(Scanner scanner) {
		if (top < mobiles.length - 1) {
			top++;
			mobiles[top] = new Mobile();
			System.out.println("Enter Mobile Brand[Apple|Samsung|Motorola|Nokia|Sony]");
			mobiles[top].setBrandName(scanner.next());
			System.out.println("Enter OS [IOS|Android]");
			mobiles[top].setOs(scanner.next());
			System.out.println("Enter Serial Number");
			mobiles[top].setSerialNumber(scanner.nextInt());

		} else {
			System.out.println("Stack is Full..");
		}
	}

	public void deleteMobileEntry() {
		if (top >= 0)
			mobiles[top--] = null;
		else
			System.out.println("Stack is empty");
	}

	public void printMobileEntry(Scanner scanner) {
		System.out.println("Enter Serial Number to Update Mobile: ");
		int serialNumber = scanner.nextInt();
		
		for(int i = 0; i<mobiles.length;i++) {
			if(mobiles[i].getSerialNumber() == serialNumber) {
				System.out.println(mobiles[i].toString());	
				break;
			}else 
				System.out.println("Record Not Found");
			
		
		}
	}
	

	public void updateMobileEntry(Scanner scanner) {
		printAllMobiles();
		System.out.println("Enter Serial Number to Update Mobile: ");
		int serialNumber = scanner.nextInt();
		
		for(int i = 0; i<mobiles.length;i++) {
			if(mobiles[i].getSerialNumber() == serialNumber) {
				System.out.println("Enter New Brand");
				mobiles[i].setBrandName(scanner.next());
				System.out.println("Enter New OS: ");
				mobiles[i].setOs(scanner.next());	
			}else {
				System.out.println("Record Not Found");
			}
		}
	}
}
