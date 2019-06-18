/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dm.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Aeroporto {
    private String nomeAeroporto;
    private int idAeroporto;
    private String paisOrigem;
    private String estado;    
    ArrayList<Aeroporto> aeroportos = new ArrayList<>();    

    public Aeroporto(String nomeAeroporto, int idAeroporto, String paisOrigem, String estado) {
        this.nomeAeroporto = nomeAeroporto;
        this.idAeroporto = idAeroporto;
        this.paisOrigem = paisOrigem;
        this.estado = estado;        
        this.aeroportos = new ArrayList<Aeroporto>();
    }   

    public Aeroporto(){
        this.aeroportos = new ArrayList<Aeroporto>();
    }
    
    public String getNomeAeroporto() {
        return nomeAeroporto;
    }

    public void setNomeAeroporto(String nomeAeroporto) {
        this.nomeAeroporto = nomeAeroporto;
    }

    public int getIdAeroporto() {
        return idAeroporto;
    }

    public void setIdAeroporto(int idAeroporto) {
        this.idAeroporto = idAeroporto;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Aeroporto> getAeroportos() {
        return aeroportos;
    }

    public void setAeroportos(ArrayList<Aeroporto> aeroportos) {
        this.aeroportos = aeroportos;
    }
    
    public void cadastroAeroporto(String nomeAeroporto,int idAeroporto, String paisOrigem, String estado){
        Aeroporto a = new Aeroporto();
        a.setNomeAeroporto(nomeAeroporto);
        a.setIdAeroporto(idAeroporto);
        a.setPaisOrigem(paisOrigem);
        a.setEstado(estado);   
        aeroportos.add(a);
    }
    
}
