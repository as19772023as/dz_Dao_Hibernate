###  Слой DAO c Hibernate

Что нужно сделать
1. Создайте Spring Boot приложение с зависимостями на два стартера — spring-boot-starter-data-jpa и spring-boot-starter-web.
2. Создайте Entity, которая соответствует таблице из условий задачи «Таблица пользователей».
3. Напишите репозиторий для работы с БД.
4. Напишите контроллер с методом-обработчиком GET-метода запроса с 
   маппингом на endpoint /persons/by-city. В query params запроса будет 
   приходить строковый параметр city, который вам надо будет передавать 
   дальше в репозиторий. То есть, ваш метод должен уметь обрабатывать 
   запрос вида localhost:8080/persons/by-city?city=Moscow. Контроллер 
   должен будет возвращать всех людей, которых он получит от репозитория.