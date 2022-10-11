package io.github.galindodiego.domain.repositorio;

import io.github.galindodiego.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Clientes extends JpaRepository<Cliente,Integer> {



    boolean existsByNome(String nome);

    @Query(value = " select * from cliente c where c.nome like '%:nome%' ",nativeQuery = true)
    List<Cliente> encontrarPorNome(@Param("nome") String nome);
    @Modifying
    @Query(" delete from Cliente c where c.nome =:nome ")
    void deleteByNome(String nome);
}
