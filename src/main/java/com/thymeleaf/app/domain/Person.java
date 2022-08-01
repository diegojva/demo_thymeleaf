package com.thymeleaf.app.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerson;

    @Column(length = 95, nullable = false)
    private String fullName;

    @Column(length = 8, nullable = false)
    private String dni;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Person person = (Person) o;
        return idPerson != null && Objects.equals(idPerson, person.idPerson);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
