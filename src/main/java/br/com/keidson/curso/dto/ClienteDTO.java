package br.com.keidson.curso.dto;

public class ClienteDTO {

  private String nome;
  private String endereco;
  private String telefone;

  public ClienteDTO(String nome, String endereco, String telefone) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
  }

  public ClienteDTO() {
  }

  public static ClienteDTOBuilder builder() {
    return new ClienteDTOBuilder();
  }

  public String getNome() {
    return this.nome;
  }

  public String getEndereco() {
    return this.endereco;
  }

  public String getTelefone() {
    return this.telefone;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof ClienteDTO)) return false;
    final ClienteDTO other = (ClienteDTO) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$nome = this.getNome();
    final Object other$nome = other.getNome();
    if (this$nome == null ? other$nome != null : !this$nome.equals(other$nome)) return false;
    final Object this$endereco = this.getEndereco();
    final Object other$endereco = other.getEndereco();
    if (this$endereco == null ? other$endereco != null : !this$endereco.equals(other$endereco)) return false;
    final Object this$telefone = this.getTelefone();
    final Object other$telefone = other.getTelefone();
    if (this$telefone == null ? other$telefone != null : !this$telefone.equals(other$telefone)) return false;
    return true;
  }

  protected boolean canEqual(final Object other) {
    return other instanceof ClienteDTO;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $nome = this.getNome();
    result = result * PRIME + ($nome == null ? 43 : $nome.hashCode());
    final Object $endereco = this.getEndereco();
    result = result * PRIME + ($endereco == null ? 43 : $endereco.hashCode());
    final Object $telefone = this.getTelefone();
    result = result * PRIME + ($telefone == null ? 43 : $telefone.hashCode());
    return result;
  }

  public String toString() {
    return "ClienteDTO(nome=" + this.getNome() + ", endereco=" + this.getEndereco() + ", telefone=" + this.getTelefone() + ")";
  }

  public static class ClienteDTOBuilder {
    private String nome;
    private String endereco;
    private String telefone;

    ClienteDTOBuilder() {
    }

    public ClienteDTOBuilder nome(String nome) {
      this.nome = nome;
      return this;
    }

    public ClienteDTOBuilder endereco(String endereco) {
      this.endereco = endereco;
      return this;
    }

    public ClienteDTOBuilder telefone(String telefone) {
      this.telefone = telefone;
      return this;
    }

    public ClienteDTO build() {
      return new ClienteDTO(this.nome, this.endereco, this.telefone);
    }

    public String toString() {
      return "ClienteDTO.ClienteDTOBuilder(nome=" + this.nome + ", endereco=" + this.endereco + ", telefone=" + this.telefone + ")";
    }
  }
}
