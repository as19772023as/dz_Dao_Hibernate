package ru.strebkov.dz_Dao_Hibernate.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.strebkov.dz_Dao_Hibernate.entity.Person;
import ru.strebkov.dz_Dao_Hibernate.service.ServicePerson;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/persons")
public class ControllerPerson {

    private final ServicePerson servicePerson;

    @GetMapping("/by-city") //localhost:8080/persons/by-city?city=Moscow
    public List<Person> findByCityOfLiving(@RequestParam(value = "city", required = false) String city) {
        return servicePerson.findByCityOfLiving(city);
    }

    @GetMapping("/by-age") // localhost:8080/persons/by-age?age=23
    protected List<Person> findPersonByDataPerson_AgeBeforeOrderByDataPersonAsc
            (@RequestParam(value = "age", required = false) Integer age) {
        return servicePerson.findPersonByDataPerson_AgeBeforeOrderByDataPersonAsc(age);
    }

    @GetMapping("/by-name-surname") // localhost:8080/persons/by-name-surname?name=Ivan&surname=Ivanov
    protected Optional<Person> findPersonByContact_NameContainingIgnoreCaseAndAndContact_SurnameContainingIgnoreCase
            (@RequestParam(value = "name", required = false) String name, @RequestParam(value = "surname", required = false) String surname) {
        return servicePerson.findPersonByDataPerson_NameContainingIgnoreCaseAndAndDataPerson_SurnameContainingIgnoreCase
                (name, surname);
    }
    @GetMapping("/hi")
    public String hi() {
        return "hi, not authenticated user!";
    }

}
