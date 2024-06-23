package br.com.keidson.curso.entities;

import java.util.List;

public class EndrecoEntity {
    private Long id;
    private String logradouro;
    private String cep;
    private String bairro;
    private List<ClienteEntity> cliente; // many-to-one - um endreço tem muitos clientes, e um cliente tem um endreço;
}
