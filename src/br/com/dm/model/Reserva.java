/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Flávio
 */
public class Reserva {
private String nome;
private String cpf;
private int idCliente;
private int idVoo;
private int idLocalidade;
private String destino;
private int idReserva;
private Date data;
private double hora;
ArrayList<Assento> assento;

    public Reserva(String nome, String cpf, int idCliente, int idVoo, int idLocalidade, String destino, int idReserva, Date data, double hora, ArrayList<Assento> assento) {
        this.nome = nome;
        this.cpf = cpf;
        this.idCliente = idCliente;
        this.idVoo = idVoo;
        this.idLocalidade = idLocalidade;
        this.destino = destino;
        this.idReserva = idReserva;
        this.data = data;
        this.hora = hora;
        this.assento = assento;
    }

    public Reserva() {
    }

    public Reserva(String string, String string0, int aInt, int aInt0, int aInt1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public int getIdVoo() {
        return idVoo;
    }

    public void setIdVoo(int idVoo) {
        this.idVoo = idVoo;
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

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public ArrayList<Assento> getAssento() {
        return assento;
    }

    public void setAssento(ArrayList<Assento> assento) {
        this.assento = assento;
    }


}
