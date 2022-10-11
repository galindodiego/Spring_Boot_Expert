package io.github.galindodiego.domain.repository;

import io.github.galindodiego.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido,Integer> {
}
