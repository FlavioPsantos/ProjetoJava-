/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dm.model;

/**
 *
 * @author Flávio
 */
public class Localidade {
   private String pais;
   private String cidade;
   private String estado;
   private int idlocalidade;
   private Localidade paisOri;

    public Localidade() {
    }

    public Localidade(String pais, String cidade, String estado, int idlocalidade) {
        this.pais = pais;
        this.cidade = cidade;
        this.estado = estado;
        this.idlocalidade = idlocalidade;
        this.paisOri = paisOri;
    }

    public Localidade(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Localidade getPaisOri() {
        return paisOri;
    }

    public void setPaisOri(Localidade paisOri) {
        this.paisOri = paisOri;
    }

    
    
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdlocalidade() {
        return idlocalidade;
    }

    public void setIdlocalidade(int idlocalidade) {
        this.idlocalidade = idlocalidade;
    }

    @Override
    public String toString() {
        return "Localidade{" + "pais=" + pais + ", cidade=" + cidade + ", estado=" + estado + ", idlocalidade=" + idlocalidade + '}';
    }
    
    
   
}
