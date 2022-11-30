package com.newproject.new_project.repository;

import com.newproject.new_project.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Long> {
    @Query(value = "SELECT id,name,gender,surname,username FROM random.random order by RAND() LIMIT 1 ", nativeQuery = true)
    List<Person> findAll();
}