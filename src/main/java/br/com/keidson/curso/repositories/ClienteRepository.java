package br.com.keidson.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.keidson.curso.entities.ContatoEntity;

public interface ClienteRepository extends JpaRepository<ContatoEntity, Long> { }
