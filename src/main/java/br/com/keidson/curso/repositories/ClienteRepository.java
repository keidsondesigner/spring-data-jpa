package br.com.keidson.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.keidson.curso.entities.ClienteEntity;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

    List<ClienteEntity> findByEnderecoId(Long idEndereco);

    @Query("SELECT c FROM ClienteEntity c WHERE c.contato.id = :idContato")
    Optional<ClienteEntity> recuperarClientePorContato(Long idContato);
}
