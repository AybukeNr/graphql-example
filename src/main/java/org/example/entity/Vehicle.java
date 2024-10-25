package org.example.entity;

import java.io.Serializable;
import java.time.LocalDate;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vehicle")
@Getter
@Setter
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100, name = "vehicle_type")
    private String type;

    @Column(length = 100, name = "model_code")
    private String modelCode;

    @Column(length = 100, name = "brand_name")
    private String brandName;

    @Column(length = 100, name = "launch_date")
    private LocalDate launchDate;
}