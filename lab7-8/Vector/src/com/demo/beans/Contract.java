package com.demo.beans;

import java.time.LocalDate;

public class Contract extends Employee {
	private int hrs ;
	private double charges;
	/**
	 * @return the hrs
	 */
	public int getHrs() {
		return hrs;
	}
	/**
	 * @param hrs the hrs to set
	 */
	public void setHrs(int hrs) {
		this.hrs = hrs;
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
		return "Contract [hrs=" + hrs + ", charges=" + charges + "]";
	}
	public Contract(int pid, String name, String mob,String email,String dept, String desg, LocalDate doj,int hrs, double charges) {
		super(pid, name, mob, email, dept, desg, doj);
		this.hrs = hrs;
		this.charges = charges;
	}
	public Contract() {
		
	}
}
