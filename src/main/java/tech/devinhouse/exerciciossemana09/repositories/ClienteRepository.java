package tech.devinhouse.exerciciossemana09.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.devinhouse.exerciciossemana09.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
