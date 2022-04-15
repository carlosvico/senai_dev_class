package com.senai.devagro.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.List;


@Data
@Entity
@Table(name = "empresas")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String nome;

//  Regex validador para cnpj
    @Pattern(regexp = "^\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}\\-\\d{2}$", message = "Campo deve ser um número válido")
    private String cnpj;

    @Column(nullable = false, length = 255)
    private String endereco;

    @OneToMany(mappedBy = "empresa")
    private List<Fazenda> fazendas;

    public Empresa() {

    }

//    @OneToMany(mappedBy = "empresa")
//    private List<Grao> graos;
//
//    @OneToMany(mappedBy = "empresa")
//    private List<Funcionario> funcionarios;

}
