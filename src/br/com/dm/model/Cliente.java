/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dm.model;


import java.util.Date;

/**
 *
 * @author Flávio
 */
public class Cliente {
    private String nome;
    private String cpf;
    private int idCliente;
    private String idade;
    private Localidade paisOrigem;
    private String sexo;
    private String estadoCivil;

    public Cliente(String nome, String cpf, int idCliente, String dataNasc, String sexo, String estadoCivil) {
        this.nome = nome;
        this.cpf = cpf;
        this.idCliente = idCliente;
        this.idade = dataNasc;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }
    
    public Cliente() {
    }

   
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Localidade getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(Localidade paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public boolean maiorde12anos(Cliente cli){
        if(Integer.parseInt(cli.getIdade()) < 12){
            return false;
        } else                    
            return true;
    }
        
}
