package com.senai.devagro.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "graos")
public class Grao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    String nome;

    @Column(nullable = false)
    private int periodoColheita;

    @ManyToOne
    @JoinColumn(name = "fk_empresa")
    private Empresa empresa;

//    @OneToOne(mappedBy = "grao")
//    private Fazenda fazenda;

}



