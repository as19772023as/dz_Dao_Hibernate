package ru.strebkov.dz_Dao_Hibernate.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.strebkov.dz_Dao_Hibernate.entity.Person;
import ru.strebkov.dz_Dao_Hibernate.repository.RepositoryInterface;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicePerson {
    private final RepositoryInterface repository;

    @Transactional
    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }

    @Transactional
    public List<String> getPersonsNameByCity(String city) {
        return repository.getPersonsNameByCity(city);
    }

}
