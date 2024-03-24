package ru.strebkov.dz_Dao_Hibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateExampleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HibernateExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
