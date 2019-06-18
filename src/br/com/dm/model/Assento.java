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
public class Assento {
    private int num;
    private Cliente cliente;
   

    public Assento(int num, Cliente a) {
        this.num = num;
        this.cliente = a;
       
    }

    public Assento() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente a) {
        this.cliente = a;
    }

 

    
    
}
    
    