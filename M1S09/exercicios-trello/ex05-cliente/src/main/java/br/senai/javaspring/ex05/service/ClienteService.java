package br.senai.javaspring.ex05.service;

import br.senai.javaspring.ex05.model.Cliente;
import br.senai.javaspring.ex05.model.ClienteDto;
import br.senai.javaspring.ex05.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

// Classe facilitadora no acessos dos models apartir do JPA(HIBERNATE)
// Um Controller passa a enxergar a Service, e o repository fica encapsulado aqui

@Service // Usa-se a annotation @Service na sua declaração
// e a convenção de nomenclatura é para representar qual model ou entity aquele serviço manipula.
public class ClienteService {
    @Autowired // indica um ponto aonde a injeção automática deve ser aplicada.
    private ClienteRepository clienteRepository;

    //    ==================    Criar  =================
    public Cliente criarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    //    ==================    Listar  =================
    public List<Cliente> pegarClientes() {
        return clienteRepository.findAll();
    }

    //    ==================   Pesquisa por id  =================
    public Cliente obterClienteId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }


    //    ==================   Deleta por id  =================
    public String deletaClienteId(Long id) {
        clienteRepository.deleteById(id);
        return "Cliente deletado Com sucesso!";
    }

    //    ==================   Alrera por nome =================
    public Cliente alteraCliente(@PathVariable long id, @RequestBody ClienteDto clienteDto) {
        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNome(clienteDto.getNome());
        cliente.setCpf(clienteDto.getCpf());
        clienteRepository.save(cliente);
        return cliente;
    }

}
