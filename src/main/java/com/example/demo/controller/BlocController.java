package com.example.demo.controller;


import com.example.demo.entity.Bloc;
import com.example.demo.entity.Chambre;
import com.example.demo.service.BlocService;
import com.example.demo.service.impl.BlocServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloc")
@AllArgsConstructor

@Tag(name="Gestion Bloc")
public class BlocController {

    BlocService blocService;

    @PostMapping("/save")
    public Bloc save (@RequestBody Bloc bloc){
        return blocService.save(bloc);
    }

    @GetMapping("/get-all-bloc")
    public List<Bloc> findAll() {
        return blocService.findAll();
    }

    @DeleteMapping("/delete-bloc/{idBloc}")
    public void delete(@PathVariable("idBloc")Long idBloc){
        blocService.delete(idBloc);
    }

    @GetMapping("get-bloc/{idBloc}")
    public Bloc findById(@PathVariable("idBloc")Long idBloc){
        return blocService.findById(idBloc);
    }

}