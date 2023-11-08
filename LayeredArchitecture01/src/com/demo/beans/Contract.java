package com.demo.beans;

import java.time.LocalDate;

public class Contract extends Employee{
    private int hrs;
    private double charges;

    public Contract(int pid, String name, String mob, String email, String dept, String desg, LocalDate doj, int hrs, double charges) {
        super(pid, name, mob, email, dept, desg, doj);
        this.hrs = hrs;
        this.charges = charges;
    }

    public Contract() {

    }


    public int getHrs() {
        return hrs;
    }

    public double getCharges() {
        return charges;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    @Override
    public String toString() {
        return super.toString()+ "Contract{" +
                "hrs=" + hrs +
                ", charges=" + charges +
                '}';
    }


    

}
