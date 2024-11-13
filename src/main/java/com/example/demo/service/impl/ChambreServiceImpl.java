package com.example.demo.service.impl;

import com.example.demo.Repository.ChambreRepository;
import com.example.demo.entity.Chambre;
import com.example.demo.service.ChambreService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class ChambreServiceImpl implements ChambreService {


    ChambreRepository chambreRepository;


    @Override
    public Chambre save(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre findById(Long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public List<Chambre> findAll() {
        return chambreRepository.findAll();
    }

    @Override
    public void delete(Long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public Chambre Modify(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
}
