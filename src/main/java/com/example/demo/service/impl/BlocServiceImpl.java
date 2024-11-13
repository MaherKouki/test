package com.example.demo.service.impl;

import com.example.demo.Repository.BlocRepository;
import com.example.demo.entity.Bloc;
import com.example.demo.service.BlocService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements BlocService{


    BlocRepository blocRepository;


    @Override
    public Bloc save(Bloc bloc) {
        return blocRepository.save(bloc);
    }


    @Override
    public Bloc findById(Long idBloc) {
        return blocRepository.getById(idBloc);
    }

    @Override
    public List<Bloc> findAll() {
        return blocRepository.findAll();

    }

    @Override
    public void delete(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }
}
