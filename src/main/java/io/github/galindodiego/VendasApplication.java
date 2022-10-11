package io.github.galindodiego;

import io.github.galindodiego.domain.entity.Cliente;
import io.github.galindodiego.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VendasApplication {


    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
        return args -> {
            System.out.println("Salvando Clientes");
            clientes.save(new Cliente("Diego"));
            clientes.save(new Cliente("Amanda"));

            boolean existe = clientes.existsByNome("Diego");
            System.out.println("existe um cliente com o nome Diego "+ existe);

        };

    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class,args);
    }
}
