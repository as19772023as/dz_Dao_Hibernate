package ru.strebkov.dz_Dao_Hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class DataPerson {
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 100, nullable = false)
    private String surname;
    @Column(nullable = false)
//    @Max(150)
//    @Min(0)
    private int age;

}
