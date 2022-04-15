package com.senai.devagro.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "fazendas")
public class Fazenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 255)
    private String nome;

    @Column(nullable = false, length = 255)
    private String endereco;


    @OneToOne
    @JoinColumn(name = "fk_grao")
    private Grao grao;

    private BigDecimal estoqueInicial;

    @ManyToOne
    @JoinColumn(name = "fk_empresa")
    private Empresa empresa;

//    @JsonFormat(pattern = "dd-MM-aaaa")
//    private Date ultimaColheita;



}