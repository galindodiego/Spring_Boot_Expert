package io.github.galindodiego.domain.repository;

import io.github.galindodiego.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pedidos extends JpaRepository<Pedido,Integer> {
}
