package br.com.keidson.curso.dto;

public class ContatoDTO {
    private String descricao;
    private String telefone;

    public ContatoDTO(String descricao, String telefone) {
        this.descricao = descricao;
        this.telefone = telefone;
    }

    public ContatoDTO() {
    }

    public static ContatoDTOBuilder builder() {
        return new ContatoDTOBuilder();
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ContatoDTO)) return false;
        final ContatoDTO other = (ContatoDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$descricao = this.getDescricao();
        final Object other$descricao = other.getDescricao();
        if (this$descricao == null ? other$descricao != null : !this$descricao.equals(other$descricao)) return false;
        final Object this$telefone = this.getTelefone();
        final Object other$telefone = other.getTelefone();
        if (this$telefone == null ? other$telefone != null : !this$telefone.equals(other$telefone)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ContatoDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $descricao = this.getDescricao();
        result = result * PRIME + ($descricao == null ? 43 : $descricao.hashCode());
        final Object $telefone = this.getTelefone();
        result = result * PRIME + ($telefone == null ? 43 : $telefone.hashCode());
        return result;
    }

    public String toString() {
        return "ContatoDTO(descricao=" + this.getDescricao() + ", telefone=" + this.getTelefone() + ")";
    }

    public static class ContatoDTOBuilder {
        private String descricao;
        private String telefone;

        ContatoDTOBuilder() {
        }

        public ContatoDTOBuilder descricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public ContatoDTOBuilder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public ContatoDTO build() {
            return new ContatoDTO(this.descricao, this.telefone);
        }

        public String toString() {
            return "ContatoDTO.ContatoDTOBuilder(descricao=" + this.descricao + ", telefone=" + this.telefone + ")";
        }
    }
}
