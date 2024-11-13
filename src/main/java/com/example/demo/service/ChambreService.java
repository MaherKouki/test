package com.example.demo.service;

import com.example.demo.entity.Chambre;

import java.util.List;
import java.util.Optional;

public interface ChambreService {

    Chambre save(Chambre chambre);

    Chambre findById(Long idChambre);

    List<Chambre> findAll();

    void delete(Long idChambre);

    Chambre Modify(Chambre chambre);


}
