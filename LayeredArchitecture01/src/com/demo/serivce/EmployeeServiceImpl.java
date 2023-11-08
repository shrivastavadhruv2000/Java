package com.demo.serivce;

import com.demo.beans.Contract;
import com.demo.beans.Employee;
import com.demo.beans.Salaried;
import com.demo.beans.Vendor;
import com.demo.doa.EmployeeDao;
import com.demo.doa.EmployeeDaoImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDao edao;
    public EmployeeServiceImpl(){
        edao=new EmployeeDaoImpl();
    }
    @Override
    public void addnewEmployee(int ch) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Pid");
        int pid=sc.nextInt();

        System.out.println("Enter the Name");
        String name=sc.next();

        System.out.println("Enter the email");
        String email =sc.next();

        System.out.println("Enter the mobile");
        String mob=sc.next();

        System.out.println("Enter the department");
        String dept=sc.next();

        System.out.println("Enter the designation");
        String desg=sc.next();

        System.out.println("enter date of joining(dd/MM/yyyy)");
        String dt=sc.next();
        LocalDate ldt=LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Employee e=null;
        if(ch==1){
            System.out.println("Enter Salary");
            double s=sc.nextDouble();
            System.out.println("Enter Bouns");
            double b=sc.nextDouble();
            e=new Salaried(pid,name,mob,email,dept,desg,ldt,s,b);
        }
        else if (ch==2) {

                System.out.println("Enter hrs");
                int h=sc.nextInt();

                System.out.println("Enter charge");
                double c=sc.nextDouble();
                e=new Contract(pid,name,mob,email,dept,desg,ldt,h,c);


        } else if (ch==3) {
            System.out.println("Enter Amount");
            double a=sc.nextDouble();

            System.out.println("Enter Number of persons");
            int n=sc.nextInt();
            e=new Vendor(pid,name,mob,email,dept,desg,ldt,a,n);

        }


        edao.save(e);


    }
    public List<Employee> displayAll(){
        return edao.getAll();
    }

    @Override
    public boolean deleteById(int pid) {
        return edao.removeById(pid);
    }

    @Override
    public boolean modifySalById(int id, double salary) {
        return edao.updateSalById(id,salary);
    }

    public Employee displayById(int id){
        return edao.getById(id);
    }

    @Override
    public List<Employee> sortByName() {
        return edao.sortByName();
    }
}
