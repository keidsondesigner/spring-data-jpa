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

@Entity // quando uso a anotacão @Entity, preciso usar o @Id
@Table(name = "tb_contato")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ContatoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Include
    @Id
    private Long id;
    
    private String descricao;
    private String telefone;
}
