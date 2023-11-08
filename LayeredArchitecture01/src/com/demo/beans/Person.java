package com.demo.beans;

public class Person {
    private int pid;
    private String name;
    private String email;
    private String mob;

    Person(){

    }
    Person(int pid,String name,String mob,String email){
        this.pid=pid;
        this.name=name;
        this.email=email;
        this.mob=mob;

    }

    public Person(int pid) {
        this.pid=pid;
    }
    public boolean equals(Object ob) {
        return this.pid==((Person)ob).pid;
    }

    public void setPid(int pid){
        this.pid=pid;
    }
    public int getPid(){
        return pid;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }

    public void setMob(String mob){
        this.mob=mob;
    }

    public String getMob(){
        return mob;
    }

    public String toString(){
        return "Person [pid=" + pid + ", pname=" + name + ", mobile=" + mob + ", email=" + email + "]";
    }
}

