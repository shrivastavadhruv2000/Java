package service;

import java.util.Scanner;
import beans.Person;
import dao.PersonDaoImpl;
import dao.PersonDao;

public class PersonServiceImpl {
	private PersonDao pdao;
	public PersonServiceImpl() {
		pdao = new PersonDaoImpl();
	}
	
	@Override
	public void addNewPerson() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter id");
		int pid =sc.nextInt();
		System.out.println("enter name");
		String nm = sc.next();
		System.out.println("enter mob");
		String mob= sc.next();
		Person p = new Person (pid, nm, mob);
		pdao.save(p);
	}
	
	@Override
	public Person displayAll() {
		return pdao.findAll();
	}
	
	@Override
	public Person displayById(int pid) {
		return pdao.findById(pid);
	}

}
