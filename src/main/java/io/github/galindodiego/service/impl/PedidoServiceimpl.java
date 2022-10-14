package io.github.galindodiego.service.impl;

import io.github.galindodiego.domain.repository.Pedidos;
import io.github.galindodiego.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceimpl implements PedidoService {

    private Pedidos repository;


    public PedidoServiceimpl(Pedidos repository) {
        this.repository = repository;
    }
}
