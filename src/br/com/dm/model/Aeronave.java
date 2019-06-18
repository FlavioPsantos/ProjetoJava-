
package br.com.dm.model;

import br.com.dm.model.Enum.EnumA;
import java.awt.List;
import java.util.ArrayList;

public class Aeronave {
    private EnumA nome;
    private int idNave;
    private int capacidade;
    private Cliente cli;
    ArrayList<Assento> assentos = new ArrayList<>();

    public Aeronave(EnumA nome, int idNave, int capacidade, Cliente cli) {
        this.nome = nome;
        this.idNave = idNave;
        this.capacidade = capacidade;
        this.cli = cli;
        this.assentos = new ArrayList<Assento>();
    }

    public Aeronave() {
        this.assentos = new ArrayList<Assento>();
    }

    public Aeronave(EnumA enumA, int aInt, int aInt0) {
        this.assentos = new ArrayList<Assento>();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.        
    }

    public EnumA getNome() {
        return nome;
    }

    public void setNome(EnumA nome) {
        this.nome = nome;
    }

    public int getIdNave() {
        return idNave;
    }

    public void setIdNave(int idNave) {
        this.idNave = idNave;
    }

    public int getCapacidade() {
      if(nome == EnumA.Boing_737)
        {
           capacidade = 162;
        }
        else if(nome == EnumA.Boing_747)
        {
            capacidade = 410;
        }
        else{
            capacidade = 870;
        }
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public ArrayList<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<Assento> assentos) {
        this.assentos = assentos;
    }

    public void locarCliente(int numAssento, Cliente cli)
    {
        Assento a = new Assento();
        a.setCliente(cli);
        a.setNum(numAssento);
        
       //if(verificarAssento()){
         assentos.add(a);  
       //}
    }
    
    private boolean verificarAssento(ArrayList<Assento> assentos, Assento a){
        for (Assento ass : assentos) {
            if(ass.getCliente() != null){
                return true;
            }
        }
        
        return false;
    }     
    
}
