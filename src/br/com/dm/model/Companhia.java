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
public class Companhia {
    private String nomeCompanhia;
    private int idCompanhia;
    private String pais;
    ArrayList<Companhia> companhias = new ArrayList<>();
    ArrayList<Aeronave> aeronaves = new ArrayList<>();
    
    public Companhia(String nomeCompanhia, int idCompanhia,String pais) {
        this.nomeCompanhia = nomeCompanhia;
        this.idCompanhia = idCompanhia;
        this.pais = pais;
        this.companhias = new ArrayList<Companhia>();
    }

    public Companhia() {
        this.companhias = new ArrayList<Companhia>();
    }

    public String getNomeCompanhia() {
        return nomeCompanhia;
    }

    public void setNomeCompanhia(String nomeCompanhia) {
        this.nomeCompanhia = nomeCompanhia;
    }

    public int getIdCompanhia() {
        return idCompanhia;
    }

    public void setIdCompanhia(int idCompanhia) {
        this.idCompanhia = idCompanhia;
    }

    public ArrayList<Companhia> getCompanhias() {
        return companhias;
    }

    public void setCompanhias(ArrayList<Companhia> companhias) {
        this.companhias = companhias;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public void cadastrarCompanhia(String nomeCompanhia,int idCompanhia,String pais){
        Companhia a = new Companhia();
        a.setNomeCompanhia(nomeCompanhia);
        a.setIdCompanhia(idCompanhia);
        a.setPais(pais);        
        companhias.add(a);
    }
    
    public void cadastrarAeronave(Companhia comp, Aeronave aero){
        comp.aeronaves.add(aero);
    }
}
