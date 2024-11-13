package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {

    @Id
    @GeneratedValue
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;

    @JsonIgnore
    @OneToOne(mappedBy = "foyer")
    private Universite universite;

    @JsonIgnore
    @OneToMany(mappedBy = "foyer")
    private List<Bloc> bloc;




}
