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


    @Bean
    public CommandLineRunner init(
            @Autowired Clientes clientes,
            @Autowired Pedidos pedidos)
            {
        return args -> {
            System.out.println("Salvando Clientes");
            Cliente diego = new Cliente("Diego");
            clientes.save(diego);

            Pedido p = new Pedido();
            p.setCliente(diego);
            p.setDataPedido(LocalDate.now());
            p.setTotal(BigDecimal.valueOf(100));

            pedidos.save(p);

//            Cliente cliente =clientes.findClienteFetchPedidos(diego.getId());
//            System.out.println(cliente);
//            System.out.println(cliente.getPedidos());


            pedidos.findByCliente(diego).forEach(System.out::println);

//            List<Cliente> result = clientes.encontrarPorNome("Diego");
//            result.forEach(System.out::println);

        };

    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class,args);
    }
}
