package com.senai.devagro.services;

import com.senai.devagro.models.Fazenda;
import com.senai.devagro.repositories.FazendaRepository;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class FazendaService {
    private final FazendaRepository repoFazenda;

    public FazendaService(FazendaRepository repo){
        this.repoFazenda = repo;
    }

    public Fazenda addFazenda(@Valid Fazenda novaFazenda) {
        return repoFazenda.save(novaFazenda);
    }

    public List<Fazenda> getAllFazendas() {
        return repoFazenda.findAll();
    }


}
