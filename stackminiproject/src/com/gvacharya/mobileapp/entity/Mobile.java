package com.gvacharya.mobileapp.entity;

public class Mobile {

	private int serialNumber;
	private String brandName;
	private String os;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int serialNumber, String brandName, String os) {
		super();
		this.serialNumber = serialNumber;
		this.brandName = brandName;
		this.os = os;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return "Mobile [serialNumber=" + serialNumber + ", brandName=" + brandName + ", os=" + os + "]";
	}

}
