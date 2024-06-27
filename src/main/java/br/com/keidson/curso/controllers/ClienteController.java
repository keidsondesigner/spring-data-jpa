package br.com.keidson.curso.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.keidson.curso.dto.ClienteDTO;
import br.com.keidson.curso.entities.ClienteEntity;
import br.com.keidson.curso.repositories.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

  private final ClienteRepository clienteRepository;

  public ClienteController(ClienteRepository clienteRepository) {
    this.clienteRepository = clienteRepository;
  }

  @GetMapping("/{id}")
  public ClienteDTO buscarPorId(@PathVariable Long id) {
    ClienteEntity clienteEntity = clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado."));
    
    return ClienteDTO.builder()
        .nome(clienteEntity.getNome())
        .endereco(clienteEntity.getEndereco().getLogradouro())
        .telefone(clienteEntity.getContato().getTelefone())
        .build();
  }
}
