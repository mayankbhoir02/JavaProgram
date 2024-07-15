package com.gvacharya.streamapi.assignment1.pincode;

public class Pincode {

	private int pincode;

	public Pincode(int pincode) {
		super();
		this.pincode = pincode;
	}

	public Pincode() {
		super();
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Pincode [pincode=" + pincode + "]";
	}
	
	
}
