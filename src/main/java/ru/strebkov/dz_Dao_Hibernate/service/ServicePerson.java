package ru.strebkov.dz_Dao_Hibernate.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.strebkov.dz_Dao_Hibernate.entity.Person;
import ru.strebkov.dz_Dao_Hibernate.repository.RepositoryInterface;

import java.util.List;

@Service
@AllArgsConstructor
public class ServicePerson {
    private RepositoryInterface repository;

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }

    public List<String> getPersonsNameByCity(String city) {
        return repository.getPersonsNameByCity(city);
    }

}
