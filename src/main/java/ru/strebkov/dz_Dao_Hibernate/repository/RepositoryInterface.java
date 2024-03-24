package ru.strebkov.dz_Dao_Hibernate.repository;

import ru.strebkov.dz_Dao_Hibernate.entity.Person;

import java.util.List;

public interface RepositoryInterface {
    List<Person> getPersonsByCity(String city);
}
