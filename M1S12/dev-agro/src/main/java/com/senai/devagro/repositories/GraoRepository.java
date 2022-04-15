package com.senai.devagro.repositories;

import com.senai.devagro.models.Grao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraoRepository extends JpaRepository<Grao, Long> {
}
