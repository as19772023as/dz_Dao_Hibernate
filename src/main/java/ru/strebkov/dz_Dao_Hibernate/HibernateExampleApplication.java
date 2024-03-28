package ru.strebkov.dz_Dao_Hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;
import ru.strebkov.dz_Dao_Hibernate.entity.DataPerson;
import ru.strebkov.dz_Dao_Hibernate.entity.Person;
import ru.strebkov.dz_Dao_Hibernate.repository.CustomizedCrudRepositoryPerson;
import ru.strebkov.dz_Dao_Hibernate.repository.RepositoryInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class HibernateExampleApplication implements CommandLineRunner {
    //    @PersistenceContext
//    private EntityManager entityManager;
    @Autowired
    private CustomizedCrudRepositoryPerson customizedCrudRepositoryPerson;
//    @Autowired
//    private RepositoryInterface repositoryInterface;

    public static void main(String[] args) {
        SpringApplication.run(HibernateExampleApplication.class, args);
        // отключаем баннер Spring boot, если не хотим видеть его логи в консоли
//        SpringApplication app = new SpringApplication((CommandLineRunner.class));
//        app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);
    }


    @Transactional
    @Override
    public void run(String... args) throws Exception {

//        List<Person> personList = new ArrayList<>();
//        personList.add(Person.builder()
//                .dataPerson(DataPerson.builder()
//                        .name("In")
//                        .surname("Vans")
//                        .age(26)
//                        .build())
//                .phoneNumber("15122222777")
//                .cityOfLiving("VLG")
//                .build());
//        personList.add(Person.builder()
//                .dataPerson(DataPerson.builder()
//                        .name("Yn")
//                        .surname("Van")
//                        .age(27)
//                        .build())
//                .phoneNumber("15111117777")
//                .cityOfLiving("VLG")
//                .build());
//        customizedCrudRepositoryPerson.saveAll(personList);

//        List<Person> all = customizedCrudRepositoryPerson.findAll();
//        all.forEach(System.out::println);

//        Optional<Person> byId = customizedCrudRepositoryPerson.findById(DataPerson.builder()
//                .name("Inf")
//                .surname("Vans")
//                .age(26)
//                .build());
//        if(byId.isPresent()) {
//            System.out.println(byId.get());
//        } else {
//            System.out.println("нет такого");
//        }
        // сортировка
      //  var all = customizedCrudRepositoryPerson.findAll(Sort.by("cityOfLiving")); // имя как в классе
        // var all = customizedCrudRepositoryPerson.findAll(Sort.by(Sort.Direction.DESC, "cityOfLiving"));
//        var all = customizedCrudRepositoryPerson.findAll(Sort.by(new Sort.Order(Sort.Direction.DESC, "cityOfLiving")));
//        all.forEach(System.out::println);

        // пагинация, сколько страниц (объектов) выводить от 0 до 3-5..., сортировка любой сложности....
//        PageRequest pageRequest = PageRequest.of(0, 5, Sort.by("cityOfLiving"));
//        var all = customizedCrudRepositoryPerson.findAll(pageRequest);
//        all.forEach(System.out::println);

        // методы-запросы в названии

//        методы-запросы + в customizedCrudRepositoryPerson метод findBy.... имя переменной из класса
        // НО КОНКРЕТНОЕ ОТДЕЛЬНОЕ ПОЛЕ ВЫДЕРНУТЬНЕ СМОЖЕМ
        //   логика не нужна работает часть Хибернета QueryBuilder (еще есть часть ORM)
//        var all = customizedCrudRepositoryPerson.findByCityOfLiving("Moscow");
//        all.forEach(System.out::println);
//        var all = customizedCrudRepositoryPerson.findByCityOfLivingStartsWith("Y");//
//        // +  "Y",Sort...., но пибавляем в интерфейсе тоже Sort sort  или  Pageable p
//        System.out.println(all);
//

       // @Query(...........)
       // @Param("....")

        var all = customizedCrudRepositoryPerson.findByCityOfLivingjPQL("22222222222");
                // +  "Y",Sort...., но пибавляем в интерфейсе тоже Sort sort  или  Pageable p
        System.out.println(all);
    }


}