package br.senai.javaspring.ex05.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "conta")
public class Conta {
    @NotNull
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private double saldo;
    @ManyToOne
    @NotBlank
    @Column(name = "cliente_id")
    private Cliente cliente;
}
