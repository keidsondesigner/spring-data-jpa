package br.com.keidson.curso.repositories;

import br.com.keidson.curso.entities.ContatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<ContatoEntity, Long> { }
