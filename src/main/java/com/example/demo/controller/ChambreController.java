package com.example.demo.controller;


import com.example.demo.entity.Chambre;
import com.example.demo.service.ChambreService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreController {

    ChambreService chambreService;

    @PostMapping("/save")
    public Chambre save (@RequestBody Chambre chambre){
        return chambreService.save(chambre);
    }

    @GetMapping("/get-all-chambre")
    public List<Chambre> findAll() {
        return chambreService.findAll();
    }

    @DeleteMapping("/delete-chambre/{idChambre}")
    public void delete(@PathVariable("idChambre")Long idChambre){
        chambreService.delete(idChambre);
    }

    @GetMapping("get-chambre/{idChambre}")
    public Chambre findById(@PathParam("idChambre")Long idChambre){
        return chambreService.findById(idChambre);
    }

    @PutMapping("/modify")
    public Chambre Modify (@RequestBody Chambre chambre){
        return chambreService.Modify(chambre);
    }

}
