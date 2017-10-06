package Entities;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "Imagem_Produto", schema = "Vendas", catalog = "")
public class ImagemProdutoEntity {
    private String imagemId;
    private byte[] imagem;

    @Id
    @Column(name = "Imagem_ID")
    public String getImagemId() {
        return imagemId;
    }

    public void setImagemId(String imagemId) {
        this.imagemId = imagemId;
    }

    @Basic
    @Column(name = "imagem")
    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImagemProdutoEntity that = (ImagemProdutoEntity) o;

        if (imagemId != null ? !imagemId.equals(that.imagemId) : that.imagemId != null) return false;
        if (!Arrays.equals(imagem, that.imagem)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = imagemId != null ? imagemId.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(imagem);
        return result;
    }
}
