package io.github.galindodiego.service;

import io.github.galindodiego.domain.entity.Pedido;
import io.github.galindodiego.rest.dto.PedidoDTO;

public interface PedidoService {

    Pedido salvar (PedidoDTO dto);
}
