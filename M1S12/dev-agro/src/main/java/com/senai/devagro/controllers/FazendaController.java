package com.senai.devagro.controllers;

import com.senai.devagro.models.Fazenda;

import com.senai.devagro.services.FazendaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/fazendas") // @RequestMapping("/endpoint-da-api")
public class FazendaController {

    private FazendaService service;


    public FazendaController(FazendaService service) {
        this.service = service;
    }

    @PostMapping("/cadastrarFazenda")
    public Fazenda makeFazenda(@RequestBody @Valid Fazenda novaFazenda) {
        return service.addFazenda(novaFazenda);
    }

    @GetMapping("/listaFazendas")
    public ResponseEntity<List<Fazenda>> getAllFazendas() {
        List<Fazenda> lista = service.getAllFazendas();
        return ResponseEntity.ok().body(lista);
    }
//
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Fazenda> encontraFazendaId(@PathVariable Long id) {
//        Fazenda fazenda = service.getById(id);
//        return ResponseEntity.ok().body(fazenda);
//    }
}