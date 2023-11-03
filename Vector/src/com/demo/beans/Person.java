package com.demo.beans;

public class Person {
	private int pid;
	private String name;
	private String email;
	private String mob;
	/**
	 * @return the mob
	 */
	public String getMob() {
		return mob;
	}
	/**
	 * @param mob the mob to set
	 */
	public void setMob(String mob) {
		this.mob = mob;
	}
	
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", email=" + email + ", mob=" + mob + "]";
	}
	public Person() {
		
	}
	public Person(int pid, String name, String mob,String email) {
		super();
		this.pid = pid;
		this.name = name;
		this.email = email;
		this.mob=mob;
	}
	
	
	
	
	
	
	
}
