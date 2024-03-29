###  Задача «Слой DAO c JPA Repositories»

Попрактикуемся в работе с JPA Repositories, переписав приложение для работы с БД «Слой DAO c Hibernate».

Что нужно сделать

1. Перепишите репозиторий для работы с БД на основе методов-запросов:
чтобы у вашего репозитория были основные методы для CRUD операций;
2. создайте метод, который будет принимать название города (city) и 
   возвращать Entity из базы данных, которые соответствуют этому city;
3. создайте метод, который будет принимать возраст (age) и возвращать 
   Entity из базы данных, которые меньше переданного age и отсортированы по возрастанию;
4. создайте метод, который будет принимать имя и фамилию (name и surname) и 
   возвращать Entity из базы данных, которые соответствуют сочетанию name и surname и являются Optional.
5. Допишите недостающие методы контроллера в соответствии с появившимися новыми методами в репозитории.

Написанный код выложите в тот же репозиторий, что и для задачи «Слой DAO c 
Hibernate» на GitHub, только создайте под него другую ветку jpa-repository 
и прикрепите ссылку на неё в комментарий к домашнему заданию.

миграция таблицы и Данных используя Liquibase (используя init - файлы в папке static, при этом варианте нужно переместить файла в  resourse и откл Liquibase )