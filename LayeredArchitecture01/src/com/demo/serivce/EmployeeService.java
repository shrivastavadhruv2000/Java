package com.demo.serivce;

import com.demo.beans.Employee;

import java.util.List;

public interface EmployeeService {
    void addnewEmployee(int ch);

    List<Employee> displayAll();

    boolean deleteById(int eid);

    Employee displayById(int id);

    List<Employee> sortByName();


    boolean modifySalById(int id, double salary);


}
