package com.demo.doa;

import com.demo.beans.Employee;

import java.util.List;

public interface EmployeeDao {
    void save(Employee e);
    List<Employee> getAll();

    boolean removeById(int eid);

    boolean updateSalById(int id, double salary);



    Employee getById(int id);

    List<Employee> sortByName();
}
