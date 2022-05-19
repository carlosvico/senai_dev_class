package br.senai.javaspring.ex06.model;

import br.senai.javaspring.ex06.ultilitarios.Utils;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta {
    private static int contadoConta = 0001;
    private  int contaId;
    private int numeroConta;
    private Cliente cliente;
    private Double saldo = 0.0;

    public Conta(Cliente cliente) {
        this.numeroConta = contadoConta;
        this.cliente = cliente;
        contadoConta += 1;
    }

    @Override
    public String toString() {
        return "Conta{" +
                ","+ Utils.linhaN(this.cliente.getNome())+
                "\nnumeroConta=" + this.numeroConta +
               ",\nNome: " + this.cliente.getNome() +
               ",\nCPF:" + this.cliente.getCpf() +
               ",\nsaldo=" + Utils.doubleToString(this.saldo) +
               ","+ Utils.linha()+
                '}';
    }


    public void depositar(Double valor){
        if (valor > 0){
            setSaldo(getSaldo() + valor );
        System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Não foi possivel realizar o deposito");
        }
    }

    public void saque(Double valor){
        if (valor > 0 && getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Não foi possivel realizar o saque");

        }
    }

    public void transferir(Conta contaDestino, Double valor){
        if (valor > 0 && getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            contaDestino.saldo = contaDestino.getSaldo() + valor;
            System.out.println("Transferência realizada com sucesso");
        } else {
            System.out.println("Não foi possivel realizar a Transferência");

        }
    }


}

//No Projeto Spring Framework, adicione uma entidade !Conta! .
//O programa deve ser capaz de:
//
//Criar um novo objeto Conta
//Pesquisar todos os objetos Conta
//Deletar um objeto Conta específico com base no seu ID
//Alterar um objeto Conta com base no seu ID
//Pesquisar um objeto Conta com base no seu ID
//A Conta deve ter um cliente vinculado a ela e ser criada com um valor zerado.
//Deve ser possível realizar depósitos e saques de valores de uma Conta, porém o valor na Conta nunca pode ficar negativo.
