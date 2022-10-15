package io.github.galindodiego.service;

import io.github.galindodiego.domain.entity.Pedido;
import io.github.galindodiego.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {

    Pedido salvar (PedidoDTO dto);

    Optional <Pedido> obterPedidoCompleto(Integer id);
}
