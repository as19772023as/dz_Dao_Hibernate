package ru.strebkov.dz_Dao_Hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.strebkov.dz_Dao_Hibernate.entity.Person;

import java.util.List;

@Repository
public class RepositoryPerson implements RepositoryInterface {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("select p.dataPerson from Person p where p.city_of_living = ?1")
                .setParameter(1, city)
                .getResultList();
    }

    @Override
    public List<String> getPersonsNameByCity(String city) {
       return entityManager.createQuery("select p.dataPerson.name from Person p where p.city_of_living = ?1")
                .setParameter(1, city)
                .getResultList();

    }

}
