package br.senai.javaspring.ex05.model;

import lombok.Data;

@Data
public class ClienteDto {
    private Long id;
    private String nome;
    private String cpf;
}
