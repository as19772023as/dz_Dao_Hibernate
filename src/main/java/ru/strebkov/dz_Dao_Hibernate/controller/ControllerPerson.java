package ru.strebkov.dz_Dao_Hibernate.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.strebkov.dz_Dao_Hibernate.entity.Person;
import ru.strebkov.dz_Dao_Hibernate.repository.RepositoryInterface;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/persons")
public class ControllerPerson {

    private RepositoryInterface repositoryPerson;

    @GetMapping("/by-city") //localhost:8080/persons/by-city?city=Moscow
    public List<Person> getPersonsByCity(@RequestParam(value = "city", required = false) String city) {
        return repositoryPerson.getPersonsByCity(city);
    }

    @GetMapping("/by-city/name") //localhost:8080/persons/by-city/name?city=Moscow
    public List<String> getPersonsNameByCity(@RequestParam(value = "city", required = false) String city) {
        return repositoryPerson.getPersonsNameByCity(city);
    }

}
