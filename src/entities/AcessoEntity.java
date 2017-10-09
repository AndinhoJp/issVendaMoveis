package entities;

import javax.persistence.*;

@Entity
@Table(name = "Acesso", schema = "Vendas", catalog = "")
public class AcessoEntity {
    private String login;
    private FuncionarioEntity funcionario;
    private String senha;

    public AcessoEntity(String login, FuncionarioEntity funcionario, String senha) {
        this.login = login;
        this.funcionario = funcionario;
        this.senha = senha;
    }

    @Id
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "senha")
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcessoEntity that = (AcessoEntity) o;

        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (senha != null ? !senha.equals(that.senha) : that.senha != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (senha != null ? senha.hashCode() : 0);
        return result;
    }

    public FuncionarioEntity getFuncionario() {
        return funcionario;
    }
}
