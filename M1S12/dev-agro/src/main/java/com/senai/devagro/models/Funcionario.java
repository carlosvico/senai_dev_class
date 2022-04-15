package com.senai.devagro.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "funcionarios")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String sobrenome;

    @Pattern(regexp = "/^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$/", message = "O número deve ser em formato válido") // validador de cpf
    private String cpf;
    private String endereco;
    private String telefone;
    private String sexo;
    private Date dtNascimento;
    private Date dtContratacao;

    @ManyToOne
    @JoinColumn(name = "fk_empresa")
    private Empresa empresa;



}




