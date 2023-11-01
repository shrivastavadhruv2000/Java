package service;

import beans.Person;

public interface PersonService {
	void addNewPerson();
	Person[] displayAll();
	
	Person displayById(int pid);
}
