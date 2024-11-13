package com.example.demo.service;

import com.example.demo.Repository.BlocRepository;
import com.example.demo.entity.Bloc;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;



public interface BlocService {
    Bloc save(Bloc bloc);

    Bloc findById(Long idBloc);

    List<Bloc> findAll();

    void delete(Long idBloc);
}
