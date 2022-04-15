package com.senai.devagro.repositories;

import com.senai.devagro.models.Empresa;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
