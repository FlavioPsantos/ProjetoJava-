/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dm.model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Flávio
 */
public class Voo {
    private int idBilhete;
    private boolean reservado;
    private int idCliente;
    private int idLocalidade;
    private String destino;
    private String pertenceComp;
    private int numeroVoo;
    private String dataHoraPartida;

    public Voo(int idBilhete, boolean reservado, int idCliente, int idLocalidade, String destino, String pertenceComp, int numeroVoo, String dataHoraPartida) {
        this.idBilhete = idBilhete;
        this.reservado = reservado;
        this.idCliente = idCliente;
        this.idLocalidade = idLocalidade;
        this.destino = destino;
        this.pertenceComp = pertenceComp;
        this.numeroVoo = numeroVoo;
        this.dataHoraPartida = dataHoraPartida;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getDataHoraPartida() {
        return dataHoraPartida;
    }

    public void setDataHoraPartida(String dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }
    
    

    public Voo() {
    }
    
    public int getIdBilhete() {
        return idBilhete;
    }

    public void setIdBilhete(int idBilhete) {
        this.idBilhete = idBilhete;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdLocalidade() {
        return idLocalidade;
    }

    public void setIdLocalidade(int idLocalidade) {
        this.idLocalidade = idLocalidade;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPertenceComp() {
        return pertenceComp;
    }

    public void setPertenceComp(String pertenceComp) {
        this.pertenceComp = pertenceComp;
    }
    
    public void fazerReserva(Cliente cli, Companhia comp, Localidade lo,int idBilhete, boolean reservado, int idCliente, int idLocalidade, String destino){
        Voo v = new Voo();
        v.setIdBilhete(idBilhete);
        v.setReservado(true);
        v.setIdCliente(cli.getIdCliente());
        v.setIdLocalidade(lo.getIdlocalidade());
        v.setPertenceComp(comp.getNomeCompanhia());        
        v.setDestino(lo.getPais());
        
                
    }
}
