package io.github.galindodiego.domain.repository;

import io.github.galindodiego.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
