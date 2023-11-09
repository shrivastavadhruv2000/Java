package com.demo.dao;

import com.demo.beans.Employee;

public interface Dao {

	void save(Employee e);

	boolean removeById(int id);
	
	int getById(int id);

	
}
