package com.newproject.new_project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.datetime.DateFormatterRegistrar;

import java.text.DateFormat;
import java.time.LocalDate;

@Entity(name = "random")
@Table(name = "random")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String age;
    String email;
    String category;


}
