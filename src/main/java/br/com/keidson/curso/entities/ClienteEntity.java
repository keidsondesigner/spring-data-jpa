package br.com.keidson.curso.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.EqualsAndHashCode.Include;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
@Table(name = "tb_cliente")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ClienteEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Include
    @Id
    private Long id;
    
    private String nome;
    private EnderecoEntity endereco;
    private ContatoEntity contato;

    @CreationTimestamp
    @Column(name = "data_criacao")
    private ZonedDateTime dataCriacao;

    @UpdateTimestamp
    @Column(name = "data_atualizacao")
    private ZonedDateTime dataAtualizacao;
}
