package com.demo.test;

import com.demo.beans.Employee;
import com.demo.serivce.EmployeeService;
import com.demo.serivce.EmployeeServiceImpl;

import java.util.List;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        EmployeeService eservice = new EmployeeServiceImpl();
        int choice=0;
        do {
            System.out.println("1. Add new Employee\n2. delete employee by id\n 3. modify salary\n");
            System.out.println("4. Display all\n5. display by id\n 6. sort by salary\n7. sort by name\n8.exit\n choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.Salaried 2.Contract 3.Vendor");
                    int ch = sc.nextInt();
                    eservice.addnewEmployee(ch);
                    break;
                case 2:
                    System.out.println("Enter the Id you wants to delete");
                    int pid=sc.nextInt();
                    boolean status=eservice.deleteById(pid);
                    if(status){
                        System.out.println("Deleted Successfully");
                    }
                    else{
                        System.out.println("not found");
                    }
                    break;
                case 3:
                    System.out.println("Enter the Id");
                    int id= sc.nextInt();

                    System.out.println("Enter the new salary");
                    double salary=sc.nextDouble();
                    status=eservice.modifySalById(id,salary);


                    break;
                case 4:
                    List<Employee> elist = eservice.displayAll();
                    if(elist!=null){
                        elist.forEach(System.out::println);
                    }
                    break;
                case 5:
                    System.out.println("Enter the ID");
                    int i=sc.nextInt();
                    Employee e=eservice.displayById(i);
                    if(e!=null){
                        System.out.println(e);
                    }
                    else{
                        System.out.println("Not Found");
                    }
                    break;
                case 6:

                    break;
                case 7:
                    List<Employee> elst=eservice.sortByName();
                    elst.stream().forEach(System.out::println);
                    break;
                case 8:
                    sc.close();
                    System.out.println("Thankyou for visiting....");
                    break;
                default:
                    System.out.print("Wrong Choice!");


            }


        }while (choice != 8) ;
    }
}
