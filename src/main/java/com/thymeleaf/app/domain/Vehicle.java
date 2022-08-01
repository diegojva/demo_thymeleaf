package com.thymeleaf.app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicle;

    private String registerDate;

    @Column(length = 7)
    private String license;

    @ManyToOne
    @JoinColumn(name = "id_person", foreignKey = @ForeignKey(name = "FK_VEHICLE_PERSON"))
    private Person person;


}
