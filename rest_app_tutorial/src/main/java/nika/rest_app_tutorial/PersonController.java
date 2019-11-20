package nika.rest_app_tutorial;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class PersonController {

    @RequestMapping("/persons")
    public List<Person> getPersons(@RequestParam(name="name") Optional<String> name, @RequestParam(name="gender") Optional<Person.gender> gender){
        List<Person> persons = new ArrayList<>();

        persons.add(new Person(1, "Nika", "Jamburia", Person.gender.MALE, 20));
        persons.add(new Person(2, "Nika", "Jamburia", Person.gender.FEMALE, 20));
        persons.add(new Person(3, "Levan", "Jamburia", Person.gender.MALE, 50));
        persons.add(new Person(4, "Giorgi", "Krawashvili", Person.gender.MALE, 21));
        persons.add(new Person(5, "Nino", "Kemularia", Person.gender.FEMALE, 29));
        persons.add(new Person(6, "Vato", "Miqadze", Person.gender.MALE, 33));

        if(name.isPresent()){
            persons = persons.stream().filter(p -> p.getFirstName().equals(name.get())).collect(Collectors.toList());
        }

        if (gender.isPresent()){
            persons = persons.stream().filter(p -> p.getGender().equals(gender.get())).collect(Collectors.toList());
        }

        return persons;
    }

    @RequestMapping("/persons/{id}")
    public List<Person> rame(@PathVariable(name="id") int id){
        List<Person> persons = new ArrayList<>();

        persons.add(new Person(1, "Nika", "Jamburia", Person.gender.MALE, 20));
        persons.add(new Person(2, "Nika", "Jamburia", Person.gender.FEMALE, 20));
        persons.add(new Person(3, "Levan", "Jamburia", Person.gender.MALE, 50));
        persons.add(new Person(4, "Giorgi", "Krawashvili", Person.gender.MALE, 21));
        persons.add(new Person(5, "Nino", "Kemularia", Person.gender.FEMALE, 29));
        persons.add(new Person(6, "Vato", "Miqadze", Person.gender.MALE, 33));

        persons = persons.stream().filter(p -> p.getId() == id).collect(Collectors.toList());

        return persons;
    }
}
