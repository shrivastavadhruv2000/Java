package com.demo.beans;
import java.time.LocalDate;

abstract public class Employee extends Person {
    private String dept;
    private String desg;
    private LocalDate doj;

    public Employee() {

    }


    public Employee(int pid, String name, String mob, String email, String dept, String desg, LocalDate doj) {
        super(pid, name, mob, email);
        this.dept = dept;
        this.desg = desg;
        this.doj = doj;
    }

    public Employee(int pid){
        super(pid);
    }

    public String getDept() {
        return dept;
    }

    public String getDesg() {
        return desg;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return super.toString()+ "Employee{" +
                "dept='" + dept + '\'' +
                ", desg='" + desg + '\'' +
                ", doj=" + doj +
                '}';
    }
}
