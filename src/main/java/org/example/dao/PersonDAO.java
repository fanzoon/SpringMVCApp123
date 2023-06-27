package org.example.dao;

import org.example.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Alexey", "Raiko", "alexeyraiko60@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Alex", "Raikov", "alexeyraiko61@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Alexandr", "Raikin", "alexeyraiko62@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Andrey", "Raiko", "alexeyraiko63@gmail.com"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setSurName(updatedPerson.getSurName());
        personToBeUpdated.setMail(updatedPerson.getMail());
    }

    public void delete(int id) {
        people.removeIf(person -> person.getId() == id);
    }
}
