package br.com.keidson.curso.dto;

public class ClienteDTO {

  private String nome;
  private String endereco;
  private String telefone;

  public ClienteDTO() {}

  public ClienteDTO(String nome, String endereco, String telefone) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
    result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ClienteDTO other = (ClienteDTO) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (endereco == null) {
      if (other.endereco != null)
        return false;
    } else if (!endereco.equals(other.endereco))
      return false;
    if (telefone == null) {
      if (other.telefone != null)
        return false;
    } else if (!telefone.equals(other.telefone))
      return false;
    return true;
  }

  // Adicionar padrão Builder
  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String nome;
    private String endereco;
    private String telefone;

    public Builder nome(String nome) {
      this.nome = nome;
      return this;
    }

    public Builder endereco(String endereco) {
      this.endereco = endereco;
      return this;
    }

    public Builder telefone(String telefone) {
      this.telefone = telefone;
      return this;
    }

    public ClienteDTO build() {
      return new ClienteDTO(nome, endereco, telefone);
    }
  }
}
