package br.senai.javaspring.ex06.controller;

import br.senai.javaspring.ex06.model.Cliente;
import br.senai.javaspring.ex06.model.ClienteDto;
import br.senai.javaspring.ex06.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    //    ==================    METODOS HTTP  =================

    //    ==================    Criar  =================

    @PostMapping("/criarCliente")
    public Cliente adicionaCliente(@RequestBody @Validated Cliente cliente) {
        return clienteService.criarCliente(cliente);
    }

    //    ==================    Listar  =================
    @GetMapping("/clientes")
    public List<Cliente> listaClientes() {
        return clienteService.pegarClientes();
    }

    //    ==================   Deleta por id  =================
    @DeleteMapping("/deletarCliente/{id}")
    public String deletar(@PathVariable Long id) {
        return clienteService.deletaClienteId(id);
    }


    //    ==================   Alrera por id =================
    @PutMapping("/alteraCliente/{id}")
    public Cliente atualizarCliente(@PathVariable Long id, @RequestBody ClienteDto clienteDto) {
        return clienteService.alteraCliente(id, clienteDto);
    }

    //    ==================   Pesquisa por id =================
    @GetMapping("/cliente/{id}")
    public Cliente pesquisarClienteId(@PathVariable Long id) {
        return clienteService.obterClienteId(id);
    }

}
