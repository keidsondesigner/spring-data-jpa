package br.com.keidson.curso.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.EqualsAndHashCode.Include;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_endereco")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EnderecoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Include
    @Id
    private Long id;
    
    private String logradouro;
    private String cep;
    private String bairro;

    private List<ClienteEntity> cliente;
}
