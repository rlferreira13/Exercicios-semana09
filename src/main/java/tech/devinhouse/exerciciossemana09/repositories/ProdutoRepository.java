package tech.devinhouse.exerciciossemana09.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.devinhouse.exerciciossemana09.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
