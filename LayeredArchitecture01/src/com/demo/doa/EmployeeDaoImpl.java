package com.demo.doa;

import java.time.LocalDate;
import java.util.ArrayList;

import com.demo.beans.*;

import java.util.List;



public class EmployeeDaoImpl implements EmployeeDao{
    static List<Employee> elist;
    static{
        elist=new ArrayList<>();
 		elist.add(new Salaried(12,"Rajat","4444","a@gmail.com","hr","associate", LocalDate.of(2002, 12,30),4556,345));
 		elist.add(new Salaried(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		elist.add(new Contract(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		elist.add(new Contract(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
    }

    @Override
    public void save(Employee e) {
        elist.add(e);
    }
    public List<Employee> getAll(){
        return elist;
    }

    @Override
    public boolean removeById(int eid) {
        return elist.remove(new Person(eid));
    }
    public Employee getById(int id){
        int pos=elist.indexOf(new Salaried(id));
        if(pos!=-1){
            return elist.get(pos);
        }
        return null;
    }

    @Override
    public List<Employee> sortByName() {
        List<Employee> elst=new ArrayList<>();
        for(Employee e:elst) {
            elst.add(e);
        }
            elst.sort(null);
            return elst;


    }

    @Override
    public boolean updateSalById(int id, double salary) {
        Employee e=getById(id);
        if(e!=null){
            if(e instanceof Salaried){
                ((Salaried)e).setSal(salary);
            }
            else if(e instanceof Contract){
                ((Contract)e).setCharges(salary);
            }
            else {
                ((Vendor)e).setAmount(salary);
            }
            return true;
        }
        return false;
    }




}
