package com.demo.dao;

import com.demo.beans.Employee;

import java.time.LocalDate;
import java.util.*;

import com.demo.beans.*;
import com.demo.dao.*;
import com.demo.service.*;

public class DaoImpl implements Dao{
	static List<Employee> elist;
	static {
		elist= new ArrayList<>();
		elist.add(new Salaried(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
 		elist.add(new Salaried(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		elist.add(new Contract(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		elist.add(new Contract(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
		
	}
	@Override
	public void save(Employee e) {
		elist.add(e);
		
	}
	@Override
	public boolean removeById(int id) {
		// TODO Aut
		int pos = getById(id);
		if(pos!=0) {
			elist.remove(pos);
			return true;
		}
		
		return false;
	}
	public int getById(int id) {
		// TODO Auto-generated method stub
		int a= elist.indexOf(new Salaried(id));
		return a;
	}
	
	

}
