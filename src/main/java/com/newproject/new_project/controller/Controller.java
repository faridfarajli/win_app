package com.newproject.new_project.controller;


import com.newproject.new_project.model.Person;
import com.newproject.new_project.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/learn")
@CrossOrigin
public class Controller {

   private final PersonService personService;

    public Controller(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping("/new")
    public Person getSave(
           @RequestBody Person person){
       return personService.save(person);
    }
    @GetMapping("/find")
    public List<Person> getFind(){
        return personService.findAll();
    }
}
