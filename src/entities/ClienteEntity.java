package entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Cliente", schema = "Vendas", catalog = "")
public class ClienteEntity {
    private String cliId;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private String endereco;
    private String numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String telFixo;
    private String telMovel;
    private String email;
    private String nomeMae;
    private String nomePai;
    private String sexo;
    private String bairro;
    private String estadoCivil;

    @Id
    @Column(name = "cli_ID")
    public String getCliId() {
        return cliId;
    }

    public void setCliId(String cliId) {
        this.cliId = cliId;
    }

    @Basic
    @Column(name = "Nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "Sobrenome")
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Basic
    @Column(name = "CPF")
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Basic
    @Column(name = "RG")
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Basic
    @Column(name = "Data_nascimento")
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Basic
    @Column(name = "Endereco")
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Basic
    @Column(name = "Numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Basic
    @Column(name = "Complemento")
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Basic
    @Column(name = "Cidade")
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Basic
    @Column(name = "Estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "Tel_fixo")
    public String getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    @Basic
    @Column(name = "Tel_movel")
    public String getTelMovel() {
        return telMovel;
    }

    public void setTelMovel(String telMovel) {
        this.telMovel = telMovel;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Nome_mae")
    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    @Basic
    @Column(name = "Nome_pai")
    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    @Basic
    @Column(name = "Sexo")
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Basic
    @Column(name = "bairro")
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Basic
    @Column(name = "estado_civil")
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClienteEntity that = (ClienteEntity) o;

        if (cliId != null ? !cliId.equals(that.cliId) : that.cliId != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (sobrenome != null ? !sobrenome.equals(that.sobrenome) : that.sobrenome != null) return false;
        if (cpf != null ? !cpf.equals(that.cpf) : that.cpf != null) return false;
        if (rg != null ? !rg.equals(that.rg) : that.rg != null) return false;
        if (dataNascimento != null ? !dataNascimento.equals(that.dataNascimento) : that.dataNascimento != null)
            return false;
        if (endereco != null ? !endereco.equals(that.endereco) : that.endereco != null) return false;
        if (numero != null ? !numero.equals(that.numero) : that.numero != null) return false;
        if (complemento != null ? !complemento.equals(that.complemento) : that.complemento != null) return false;
        if (cidade != null ? !cidade.equals(that.cidade) : that.cidade != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (telFixo != null ? !telFixo.equals(that.telFixo) : that.telFixo != null) return false;
        if (telMovel != null ? !telMovel.equals(that.telMovel) : that.telMovel != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (nomeMae != null ? !nomeMae.equals(that.nomeMae) : that.nomeMae != null) return false;
        if (nomePai != null ? !nomePai.equals(that.nomePai) : that.nomePai != null) return false;
        if (sexo != null ? !sexo.equals(that.sexo) : that.sexo != null) return false;
        if (bairro != null ? !bairro.equals(that.bairro) : that.bairro != null) return false;
        if (estadoCivil != null ? !estadoCivil.equals(that.estadoCivil) : that.estadoCivil != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cliId != null ? cliId.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (sobrenome != null ? sobrenome.hashCode() : 0);
        result = 31 * result + (cpf != null ? cpf.hashCode() : 0);
        result = 31 * result + (rg != null ? rg.hashCode() : 0);
        result = 31 * result + (dataNascimento != null ? dataNascimento.hashCode() : 0);
        result = 31 * result + (endereco != null ? endereco.hashCode() : 0);
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        result = 31 * result + (complemento != null ? complemento.hashCode() : 0);
        result = 31 * result + (cidade != null ? cidade.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (telFixo != null ? telFixo.hashCode() : 0);
        result = 31 * result + (telMovel != null ? telMovel.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (nomeMae != null ? nomeMae.hashCode() : 0);
        result = 31 * result + (nomePai != null ? nomePai.hashCode() : 0);
        result = 31 * result + (sexo != null ? sexo.hashCode() : 0);
        result = 31 * result + (bairro != null ? bairro.hashCode() : 0);
        result = 31 * result + (estadoCivil != null ? estadoCivil.hashCode() : 0);
        return result;
    }
}
