package com.newproject.new_project.service;

import com.newproject.new_project.model.Person;
import com.newproject.new_project.repository.PersonRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person save(Person person){
        return personRepository.save(person);
    }

    public List<Person> findAll(){
        return  personRepository.findAll();
    }
}
