package ru.strebkov.dz_Dao_Hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(schema = "migration")
public class Person {
    @EmbeddedId
    private DataPerson dataPerson;
    @Column(nullable = false)
    private String phone_number;
    @Column(nullable = false, length = 200)
    private String city_of_living;


}
