package com.demo.beans;

import java.time.LocalDate;

public class Employee extends Person{
	private String dept;
	private String desg;
	private LocalDate doj;
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the desg
	 */
	public String getDesg() {
		return desg;
	}
	/**
	 * @param desg the desg to set
	 */
	public void setDesg(String desg) {
		this.desg = desg;
	}
	/**
	 * @return the doj
	 */
	public LocalDate getDoj() {
		return doj;
	}
	/**
	 * @param doj the doj to set
	 */
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", desg=" + desg + ", doj=" + doj + "]";
	}
	public Employee() {
		
	}
	public Employee(int pid, String name, String mob, String email,  String dept, String desg, LocalDate doj) {
		super(pid , name , mob, email);
		this.dept = dept;
		this.desg = desg;
		this.doj = doj;
	}
	
	

}
