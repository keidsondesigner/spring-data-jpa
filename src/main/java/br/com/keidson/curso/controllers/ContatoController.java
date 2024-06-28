package br.com.keidson.curso.controllers;

import br.com.keidson.curso.dto.ContatoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.keidson.curso.entities.ContatoEntity;
import br.com.keidson.curso.repositories.ContatoRepository;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

  private final ContatoRepository contatoRepository;

  public ContatoController(ContatoRepository contatoRepository) {
    this.contatoRepository = contatoRepository;
  }

  @GetMapping("/{id}")
  public ContatoDTO buscarPorId(@PathVariable Long id) {
    ContatoEntity contatoEntity = contatoRepository.findById(id).orElseThrow(() -> new RuntimeException("Contato não encontrado."));

    return ContatoDTO.builder()
        .descricao(contatoEntity.getDescricao())
        .telefone(contatoEntity.getTelefone())
        .build();
  }
}
