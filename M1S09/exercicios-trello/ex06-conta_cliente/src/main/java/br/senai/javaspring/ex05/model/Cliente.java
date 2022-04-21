package br.senai.javaspring.ex05.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {
    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estratégias de geração de chave primária
    @Column(name = "cliente_id")
    private Long id;
    @NotBlank
    @Column(name = "cliente_nome")
    private String nome;
    @CPF
    @NotBlank
    @Column(name = "cliente_cpf")
    private String cpf;


    @OneToMany
    @Column(name = "conta_id")
    private Conta conta;

}


