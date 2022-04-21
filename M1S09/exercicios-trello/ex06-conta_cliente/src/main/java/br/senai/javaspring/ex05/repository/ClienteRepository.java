package br.senai.javaspring.ex05.repository;

import br.senai.javaspring.ex05.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
//Agora podemos usar os metodos JpaRepository:
// save(), findOne(), findById(), findAll(), count(), delete(), deleteById().
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
