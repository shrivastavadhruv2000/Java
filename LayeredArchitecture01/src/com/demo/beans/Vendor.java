package com.demo.beans;

import java.time.LocalDate;

public class Vendor extends Employee{
    private double amount;
    private int number;


    public Vendor() {
    }

    public Vendor(int pid, String name, String mob, String email, String dept, String desg, LocalDate doj, double amount, int number) {
        super(pid, name, mob, email, dept, desg, doj);
        this.amount = amount;
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return super.toString() + "Vendor{" +
                "amount=" + amount +
                ", number=" + number +
                '}';
    }
}
