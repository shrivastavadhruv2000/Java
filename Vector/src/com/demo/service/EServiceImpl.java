package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.beans.*;
import com.demo.dao.*;


public class EServiceImpl implements EService{
	
	private Dao edao;
	public EServiceImpl() {
		edao =new DaoImpl();
	}
	
	@Override
	public void addnewEmployee(int ch) {
					
		Scanner sc= new Scanner(System.in);
		System.out.println("enter pid");
		int pid = sc.nextInt();
		System.out.println("enter name");
		String nm= sc.next();
		System.out.println("enter email");
		String em=sc.next();
		System.out.println("enter mob");
		String mob=sc.next();
		System.out.println("enter dept");
		String dept= sc.next();
		System.out.println("enter desg");
		String desg= sc.next();
		System.out.println("enter date in dd/mm/yyyy");
		String dt=sc.next();
		LocalDate ldt = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/mm/yyyy"));
		Employee e = null;
		if(ch==1) {
			System.out.println("enter salary");
			double s = sc.nextDouble();
			System.out.println("enter bonus");
			double b = sc.nextDouble();
			e= new Salaried(pid, nm, mob,em, dept, desg, ldt, s,b);
		}
		else if (ch==2) {
			System.out.println("enter hrs");
			int hrs =sc.nextInt();
			System.out.println("enter charges");
			double charges = sc.nextDouble();
			e=new Contract(pid, nm, mob, em , dept, desg, ldt, hrs, charges);
		}
		
		else {
			System.out.println("enter no of emp");
			int no = sc.nextInt();
			System.out.println("enter amount");
			double amount= sc.nextDouble();
			e=new Vendor(pid, nm, mob, em , dept, desg, ldt,no , amount);
			//vendor
		}
		edao.save(e);
	}
	

}
