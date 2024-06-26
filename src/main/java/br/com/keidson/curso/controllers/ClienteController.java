package br.com.keidson.curso.controllers;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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

  @GetMapping
  public List<ClienteDTO> buscarClientes() {
    List<ClienteEntity> entities  = clienteRepository.findAll();
    return entities.stream().map(entity -> new ClienteDTO(
        entity.getNome(), 
        entity.getEndereco().getLogradouro(), 
        entity.getContato().getTelefone()
      )).toList();
  }

  @GetMapping("/paginados")
  public Page<ClienteDTO> buscarClientesPaginados(@PageableDefault(size = 2) Pageable page) {
    Page<ClienteEntity> entities  = clienteRepository.findAll(page);
    return entities.map(entity -> new ClienteDTO(
            entity.getNome(),
            entity.getEndereco().getLogradouro(),
            entity.getContato().getTelefone()
    ));
  }

  @GetMapping("/enderecos/{idEndereco}")
  public List<ClienteDTO> buscarClientesPorEndereco(@PathVariable Long idEndereco) {
    List<ClienteEntity> entities  = clienteRepository.findByEnderecoId(idEndereco);

    return entities.stream().map(entity -> new ClienteDTO(
            entity.getNome(),
            entity.getEndereco().getLogradouro(),
            entity.getContato().getTelefone()
    )).toList();
  }

  @GetMapping("/contatos/{idContato}")
  public ClienteDTO buscarClientesPorContato(@PathVariable Long idContato) {
    ClienteEntity clienteEntity  = clienteRepository.recuperarClientePorContato(idContato).orElseThrow(() -> new RuntimeException("Cliente por contatonão encontrado."));;

    return ClienteDTO.builder()
        .nome(clienteEntity.getNome())
        .endereco(clienteEntity.getEndereco().getLogradouro())
        .telefone(clienteEntity.getContato().getTelefone())
        .build();
  }
}
