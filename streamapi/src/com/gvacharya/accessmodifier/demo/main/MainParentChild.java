package com.gvacharya.accessmodifier.demo.main;

import com.gvacharya.accessmodifier.demo.Child;

// outer class modifiers - public and default(package private)
public class MainParentChild {

	public static void main(String[] args) {
		Child child = new Child();
		child.childDisplay();
		child.display();
		
	}
}
