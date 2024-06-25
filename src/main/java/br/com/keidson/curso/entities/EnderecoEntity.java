package br.com.keidson.curso.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Getter 
@Setter 
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EnderecoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String logradouro;
    private String cep;
    private String bairro;

    // non-owner recebe a referência 'endereco' do owner 'cliente';
    @OneToMany(mappedBy = "endereco") // Um endereço tem Muitos clientes, e um cliente tem um endreço;
    private List<ClienteEntity> cliente; // indico que cliente é o dono do relacionamento;
}
