package com.senai.devagro.dtos;

import com.senai.devagro.models.Empresa;
import com.senai.devagro.models.Fazenda;
import com.senai.devagro.models.Funcionario;
import com.senai.devagro.models.Grao;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;
import java.util.List;

@Data

public class EmpresaDTO {


//    Construtor DTO que recebe a entidade Empresa como argumento facilitando a conversão posteriormente
    public EmpresaDTO(Empresa empresa) {
        id = empresa.getId();
        nome = empresa.getNome();
        cnpj = empresa.getCnpj();
        endereco = empresa.getEndereco();
    }

    public EmpresaDTO() {

    }



    private Long id;

    @Column(nullable = false, length = 255)
    private String nome;

    //  Regex validador para cnpj
    @Pattern(regexp = "^\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}\\-\\d{2}$", message = "Campo deve ser um número válido")
    private String cnpj;

    @Column(nullable = false, length = 255)
    private String endereco;

    private List<Fazenda>fazendas;

    private List<Grao>graos;


}
