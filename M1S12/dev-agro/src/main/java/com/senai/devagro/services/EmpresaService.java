package com.senai.devagro.services;

import com.senai.devagro.dtos.EmpresaDTO;
import com.senai.devagro.models.Empresa;
import com.senai.devagro.repositories.EmpresaRepository;
import com.senai.devagro.services.exception.BettaServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class EmpresaService {

    @Autowired
    private final EmpresaRepository repoEmpresa;

    public EmpresaService(EmpresaRepository repo){
        this.repoEmpresa = repo;
    }


    public EmpresaDTO adicionaEmpresa(EmpresaDTO dto) {
//        Optional<Empresa> entidade =  repoEmpresa.findById(dto.getId());
//        if (entidade != null){
//            throw new BettaServiceException("Empresa ja cadastrado no Banco");
//        }
        Empresa obj = new Empresa();
        obj.setNome(dto.getNome());
        obj.setEndereco(dto.getEndereco());
        obj.setCnpj(dto.getCnpj());

        obj = repoEmpresa.save(obj);
        return new EmpresaDTO(obj);

    }


//    public List<Empresa> listaEmpresas() {
//        return repoEmpresa.findAll();
//    }

//    public List<Empresa> listaEmpresas() {
//
//    }

//    @Transactional(readOnly = true)
    public EmpresaDTO encontraPorId(Long id){
        Empresa entidade =  repoEmpresa.findById(id).get();
        // O service trabalha com entidades, ao passar os dados
        // para o controller realizo a Conversão de entidade para EmpresaDTO
        EmpresaDTO dto = new EmpresaDTO(entidade);
        return dto;
    }



}
