package com.demo.beans;

import java.time.LocalDate;

public class Salaried extends Employee {
	private double sal;
	private double bonus;
	/**
	 * @return the sal
	 */
	public double getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(double sal) {
		this.sal = sal;
	}
	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}
	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "Salaried [sal=" + sal + ", bonus=" + bonus + "]";
	}
	public Salaried(int pid, String name, String mob,String email,String dept, String desg, LocalDate doj ,double sal, double bonus) {
		super(pid, name,mob, email, dept, desg, doj);
		this.sal = sal;
		this.bonus = bonus;
	}
	
}
