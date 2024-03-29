package ru.strebkov.dz_Dao_Hibernate.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.strebkov.dz_Dao_Hibernate.entity.Person;
import ru.strebkov.dz_Dao_Hibernate.repository.RepositoryInterface;
import ru.strebkov.dz_Dao_Hibernate.service.ServicePerson;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/persons")
public class ControllerPerson {

    private final ServicePerson servicePerson;

    @GetMapping("/by-city") //localhost:8080/persons/by-city?city=Moscow
    public List<Person> getPersonsByCity(@RequestParam(value = "city", required = false) String city) {
        return servicePerson.getPersonsByCity(city);
    }

    @GetMapping("/by-name") //localhost:8080/persons/by-name?city=Moscow
    public List<String> getPersonsNameByCity(@RequestParam(value = "city", required = false) String city) {
        return servicePerson.getPersonsNameByCity(city);
    }

}
