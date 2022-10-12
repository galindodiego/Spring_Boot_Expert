package io.github.galindodiego;

import io.github.galindodiego.domain.entity.Cliente;
import io.github.galindodiego.domain.entity.Pedido;
import io.github.galindodiego.domain.repository.Clientes;
import io.github.galindodiego.domain.repository.Pedidos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class VendasApplication {

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class,args);
    }
}
