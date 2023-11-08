package com.demo.beans;

import java.time.LocalDate;

public class Salaried extends Employee{
    private double sal;
    private double bonus;

    public Salaried() {

    }

    public Salaried(int pid, String name, String mob, String email, String dept, String desg, LocalDate doj, double sal, double bonus) {
        super(pid, name, mob, email, dept, desg, doj);
        this.sal = sal;
        this.bonus = bonus;
    }

    public Salaried(int pid) {
        super(pid);
    }

    public double getSal() {
        return sal;
    }

    public double getBonus() {
        return bonus;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString()+"Salaried{" +
                "sal=" + sal +
                ", bonus=" + bonus +
                '}';
    }
}
