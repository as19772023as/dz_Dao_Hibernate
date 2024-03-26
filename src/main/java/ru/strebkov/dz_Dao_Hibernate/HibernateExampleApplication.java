package ru.strebkov.dz_Dao_Hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import ru.strebkov.dz_Dao_Hibernate.entity.DataPerson;
import ru.strebkov.dz_Dao_Hibernate.entity.Person;

@SpringBootApplication
public class HibernateExampleApplication implements CommandLineRunner {
    @PersistenceContext
    private EntityManager entityManager;

    public static void main(String[] args) {
        SpringApplication.run(HibernateExampleApplication.class, args);
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        Person ivan = Person.builder()
                .dataPerson(DataPerson.builder()
                        .name("Ivan")
                        .surname("Ivanov")
                        .age(23)
                        .build())
                .phone_number("11111111111")
                .city_of_living("Moscow")
                .build();
        entityManager.persist(ivan);

         Person oly = Person.builder()
                .dataPerson(DataPerson.builder()
                        .name("Oly")
                        .surname("Divanov")
                        .age(30)
                        .build())
                .phone_number("22222222222")
                .city_of_living("Moscow")
                .build();
        entityManager.persist(oly);

         Person oleg = Person.builder()
                .dataPerson(DataPerson.builder()
                        .name("Oleg")
                        .surname("Bavanov")
                        .age(40)
                        .build())
                .phone_number("33333333333")
                .city_of_living("Yfa")
                .build();
        entityManager.persist(oleg);

        Person oleg2 = Person.builder()
                .dataPerson(DataPerson.builder()
                        .name("Oleg")
                        .surname("Tavanov")
                        .age(22)
                        .build())
                .phone_number("555555555555")
                .city_of_living("Vlg")
                .build();
        entityManager.persist(oleg2);

    }
}
