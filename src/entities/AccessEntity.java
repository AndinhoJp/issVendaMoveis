package entities;

import javax.persistence.*;

@Entity
@Table(name = "Acesso", schema = "Vendas", catalog = "")
public class AccessEntity {
    private String login;
    private Integer func_ID;
    private String senha;

    public AccessEntity() { }

    public AccessEntity(String login, Integer func_ID, String senha) {
        this.login = login;
        this.func_ID = func_ID;
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

    @Basic
    @Column(name = "func_ID")
    public Integer getFuncionarioId() {
        return func_ID;
    }

    public void setFuncionarioId(Integer id) { this.func_ID = id; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccessEntity that = (AccessEntity) o;

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
}
