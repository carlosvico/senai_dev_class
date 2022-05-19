package br.senai.javaspring.ex06.repository;

import br.senai.javaspring.ex06.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
//Agora podemos usar os metodos JpaRepository:
// save(), findOne(), findById(), findAll(), count(), delete(), deleteById().
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
