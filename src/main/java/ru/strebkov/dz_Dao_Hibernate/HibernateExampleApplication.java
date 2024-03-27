package ru.strebkov.dz_Dao_Hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateExampleApplication.class, args);
    }

//    @Transactional
//    @Override
//    public void run(String... args) throws Exception {
//        Person ivan = Person.builder()
//                .dataPerson(DataPerson.builder()
//                        .name("Ivan")
//                        .surname("Ivanov")
//                        .age(23)
//                        .build())
//                .phoneNumber("11111111111")
//                .cityOfLiving("Moscow")
//                .build();
//        entityManager.persist(ivan);
//
//         Person oly = Person.builder()
//                .dataPerson(DataPerson.builder()
//                        .name("Oly")
//                        .surname("Divanov")
//                        .age(30)
//                        .build())
//                .phoneNumber("22222222222")
//                .cityOfLiving("Moscow")
//                .build();
//        entityManager.persist(oly);
//
//         Person oleg = Person.builder()
//                .dataPerson(DataPerson.builder()
//                        .name("Oleg")
//                        .surname("Bavanov")
//                        .age(40)
//                        .build())
//                .phoneNumber("33333333333")
//                .cityOfLiving("Yfa")
//                .build();
//        entityManager.persist(oleg);
//
//        Person oleg2 = Person.builder()
//                .dataPerson(DataPerson.builder()
//                        .name("Oleg")
//                        .surname("Tavanov")
//                        .age(22)
//                        .build())
//                .phoneNumber("555555555555")
//                .cityOfLiving("Vlg")
//                .build();
//        entityManager.persist(oleg2);

}

