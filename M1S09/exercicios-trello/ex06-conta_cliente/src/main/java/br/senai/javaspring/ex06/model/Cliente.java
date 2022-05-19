package br.senai.javaspring.ex06.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@Entity
public class Cliente {

    private static int contador = 1;
    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estratégias de geração de chave primária
    @Column(name = "cliente_id")
    private Long id;
    @NotBlank
    @Column(name = "cliente_nome")
    private String nome;
//    @CPF
    @NotBlank
    @Column(name = "cliente_cpf")
    private String cpf;



    public Cliente(Long id, String nome, String cpf, Conta conta) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        contador += 1;

    }
}


