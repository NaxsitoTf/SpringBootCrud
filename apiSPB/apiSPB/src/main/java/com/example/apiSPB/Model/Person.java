package com.example.apiSPB.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;

    //@Column(name = "nombrePersona")
    @Column
    @Getter
    @Setter
    private String name;

    @Column
    @Getter
    @Setter
    private String telephone;

    @Column
    @Getter
    @Setter
    private int age;

}
