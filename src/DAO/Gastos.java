package DAO;
// Generated 15/09/2017 22:43:36 by Hibernate Tools 4.3.1



/**
 * Gastos generated by hbm2java
 */
public class Gastos  implements java.io.Serializable {


     private String idGasto;
     private String nomeGasto;
     private Float valor;
     private String data;

    public Gastos() {
    }

	
    public Gastos(String idGasto) {
        this.idGasto = idGasto;
    }
    public Gastos(String idGasto, String nomeGasto, Float valor, String data) {
       this.idGasto = idGasto;
       this.nomeGasto = nomeGasto;
       this.valor = valor;
       this.data = data;
    }
   
    public String getIdGasto() {
        return this.idGasto;
    }
    
    public void setIdGasto(String idGasto) {
        this.idGasto = idGasto;
    }
    public String getNomeGasto() {
        return this.nomeGasto;
    }
    
    public void setNomeGasto(String nomeGasto) {
        this.nomeGasto = nomeGasto;
    }
    public Float getValor() {
        return this.valor;
    }
    
    public void setValor(Float valor) {
        this.valor = valor;
    }
    public String getData() {
        return this.data;
    }
    
    public void setData(String data) {
        this.data = data;
    }




}

