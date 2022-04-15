package com.senai.devagro.controllers;

import com.senai.devagro.dtos.EmpresaDTO;
import com.senai.devagro.models.Empresa;
import com.senai.devagro.services.EmpresaService;
import com.senai.devagro.services.exception.BettaServiceException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;



@RestController
@RequestMapping(value = "/empresas")  // @RequestMapping: anotação utilizada tradicionalmente para implementar URL handler, e suporta os métodos HTTP
                                // Post, Get, Put, Delete e Pacth.
public class EmpresaController {

    private final EmpresaService service;


    //  Aqui estou realizando a injeção de depencia do Service no Construtor do Controller
    public EmpresaController(EmpresaService service){
        this.service = service;
    }

    @PostMapping("/cadastrarEmpresa")
    public ResponseEntity<EmpresaDTO> insert(@RequestBody EmpresaDTO dto) {
        try {
            EmpresaDTO obj = service.adicionaEmpresa(dto);
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                    .buildAndExpand(obj.getId()).toUri();
            return ResponseEntity.created(uri).body(obj);
        }
        catch (BettaServiceException e) {
            return ResponseEntity.unprocessableEntity().build();
        }
    }

    @GetMapping("/{id}")
    public EmpresaDTO encontraPorId(@PathVariable Long id){
        return service.encontraPorId(id);
    }


   // Iterable<T> retorna todas as instancias do tipo passado como parametro
//    @GetMapping ("/listarEmpresas")
//    public Iterable<Empresa>mostraEmpresas(){
//        return service.listaEmpresas();
//
//    }





}







