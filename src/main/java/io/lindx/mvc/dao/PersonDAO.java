package io.lindx.mvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import io.lindx.mvc.models.Person;

@Component
public class PersonDAO {

    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tom", 24, "tom@email.com"));
        people.add(new Person(++PEOPLE_COUNT, "Bob", 34, "bob@email.com"));
        people.add(new Person(++PEOPLE_COUNT, "Lue", 27, "lue@email.com"));
        people.add(new Person(++PEOPLE_COUNT, "John", 43, "john@email.com"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id) {
        return people.stream().filter( p -> p.getId() == id).findAny().orElse(null);
    }

	public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
	}

	public void update(int id, Person updatePerson) {
        Person updatePers = show(id);
                updatePers.setName(updatePerson.getName());
                updatePers.setAge(updatePerson.getAge());
                updatePers.setEmail(updatePerson.getEmail());
	}

	public void delete(int id) {
        people.removeIf(p -> p.getId() == id);
	}
}

/*
 * findAny - любой элемент из заданного потока удовлетворяющий условию.  
 * Найденное значение (возможно null) будет упаковано в объекте класса Optional.
 * 
 */