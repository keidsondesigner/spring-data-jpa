package br.com.keidson.curso.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
@Getter 
@Setter 
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ClienteEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;

    // owner do relacionamento;
    @ManyToOne(fetch = FetchType.LAZY) // Muitos clientes, tem Um endereço (vários clientes podem ter o mesmo endereço).
    @JoinColumn(name = "endereco_id") // "name" da chave estrangeira, "JoinColumn" a coluna endereço_id referencia a coluna id da tabela endereço;
    private EnderecoEntity endereco;

    // owner do relacionamento;
    @OneToOne(fetch = FetchType.LAZY) // Um cliente, tem Um contato (cada cliente, só tem um contato).
    @JoinColumn(name = "contato_id") // "name" da chave estrangeira, "JoinColumn" a coluna contato_id referencia a coluna id da tabela contato;
    private ContatoEntity contato;

    @CreationTimestamp
    @Column(name = "data_criacao")
    private ZonedDateTime dataCriacao;

    @UpdateTimestamp
    @Column(name = "data_atualizacao")
    private ZonedDateTime dataAtualizacao;
}
