package com.demo.beans;

import java.time.LocalDate;

public class Vendor extends Employee {
	private int no;
	private double charges;
	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}
	/**
	 * @return the charges
	 */
	public double getCharges() {
		return charges;
	}
	/**
	 * @param charges the charges to set
	 */
	public void setCharges(double charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return "Vendor [no=" + no + ", charges=" + charges + "]";
	}
	public Vendor(int pid, String name, String mob,String email, String dept, String desg, LocalDate doj,int no, double charges) {
		super(pid, name , mob, email, dept, desg, doj);
		this.no = no;
		this.charges = charges;
	}
	

}
