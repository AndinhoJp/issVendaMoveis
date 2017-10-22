package DAO;
// Generated 15/09/2017 22:43:36 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Funcionario generated by hbm2java
 */
public class Funcionario  implements java.io.Serializable {


     private String idFunc;
     private String nome;
     private String cpf;
     private String rg;
     private Date dataNascimento;
     private String estadoCivil;
     private String nomeConjuge;
     private String endereco;
     private String numero;
     private String complemento;
     private String cidade;
     private String estado;
     private String cargo;
     private Date dataContratacao;
     private Integer nivelAcesso;
     private String sexo;
     private String bairro;
     private String cep;
     private String telefone;
     private Integer status;
     private Set vendases = new HashSet(0);
     private Set faltases = new HashSet(0);
     private Set acessos = new HashSet(0);
     private Set pedidoEstoques = new HashSet(0);

    public Funcionario() {
    }

	
    public Funcionario(String idFunc, String nome, String cpf, String endereco) {
        this.idFunc = idFunc;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public Funcionario(String idFunc, String nome, String cpf, String rg, Date dataNascimento, String estadoCivil, String nomeConjuge, String endereco, String numero, String complemento, String cidade, String estado, String cargo, Date dataContratacao, Integer nivelAcesso, String sexo, String bairro, String cep, String telefone, Integer status, Set vendases, Set faltases, Set acessos, Set pedidoEstoques) {
       this.idFunc = idFunc;
       this.nome = nome;
       this.cpf = cpf;
       this.rg = rg;
       this.dataNascimento = dataNascimento;
       this.estadoCivil = estadoCivil;
       this.nomeConjuge = nomeConjuge;
       this.endereco = endereco;
       this.numero = numero;
       this.complemento = complemento;
       this.cidade = cidade;
       this.estado = estado;
       this.cargo = cargo;
       this.dataContratacao = dataContratacao;
       this.nivelAcesso = nivelAcesso;
       this.sexo = sexo;
       this.bairro = bairro;
       this.cep = cep;
       this.telefone = telefone;
       this.status = status;
       this.vendases = vendases;
       this.faltases = faltases;
       this.acessos = acessos;
       this.pedidoEstoques = pedidoEstoques;
    }
   
    public String getIdFunc() {
        return this.idFunc;
    }
    
    public void setIdFunc(String idFunc) {
        this.idFunc = idFunc;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    public Date getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public String getNomeConjuge() {
        return this.nomeConjuge;
    }
    
    public void setNomeConjuge(String nomeConjuge) {
        this.nomeConjuge = nomeConjuge;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return this.complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Date getDataContratacao() {
        return this.dataContratacao;
    }
    
    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    public Integer getNivelAcesso() {
        return this.nivelAcesso;
    }
    
    public void setNivelAcesso(Integer nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Set getVendases() {
        return this.vendases;
    }
    
    public void setVendases(Set vendases) {
        this.vendases = vendases;
    }
    public Set getFaltases() {
        return this.faltases;
    }
    
    public void setFaltases(Set faltases) {
        this.faltases = faltases;
    }
    public Set getAcessos() {
        return this.acessos;
    }
    
    public void setAcessos(Set acessos) {
        this.acessos = acessos;
    }
    public Set getPedidoEstoques() {
        return this.pedidoEstoques;
    }
    
    public void setPedidoEstoques(Set pedidoEstoques) {
        this.pedidoEstoques = pedidoEstoques;
    }




}

