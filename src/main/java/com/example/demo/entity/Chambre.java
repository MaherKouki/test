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
public class Chambre {

    @Id
    @GeneratedValue
    private Long idChambre;
    private Long numeroChambre;

    @Enumerated
    private TypeChambre typeC;

    @JsonIgnore
    @ManyToOne
    //@JoinColumn(name = "idBloc")
    private Bloc bloc;

    @JsonIgnore
    @OneToMany
    //@JsonIgnore
    private List<Reservation> reservation; //liste


}
