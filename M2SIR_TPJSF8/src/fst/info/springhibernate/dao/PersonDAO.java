package fst.info.springhibernate.dao;

import java.util.List;

import fst.info.springhibernate.model.Person;
 
public interface PersonDAO {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
    public void editPerson(Person p);
    public void detailPerson(Person p);
    public void deletePerson(Person p);
}