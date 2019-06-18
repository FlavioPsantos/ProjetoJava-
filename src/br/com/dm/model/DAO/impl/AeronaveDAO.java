/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dm.model.DAO.impl;

import br.com.dm.model.Aeronave;
import br.com.dm.model.DAO.GenericDAO;
import br.com.dm.model.Enum.EnumA;
import br.com.dm.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Flávio
 */
public class AeronaveDAO implements GenericDAO<Aeronave, Integer>{

    @Override
    public void inserir(Aeronave obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("INSERT INTO aeronave"
                                + "(nome, capacidade, idnave)  VALUES" 
                                + "(?,?,?);");
        pst.setObject(1, obj.getNome());
        pst.setInt(2, obj.getCapacidade());
        pst.setInt(3, obj.getIdNave());
        
        
        pst.executeUpdate(); 
    }

    @Override
    public void alterar(Aeronave obj) throws ClassNotFoundException, SQLException {
    Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("UPDATE aeronave SET " 
                        + "( nome = ?, capacidade = ?,  WHERE idnave = ? )");
        
        
        pst.setObject(1, obj.getNome());
        pst.setInt(2, obj.getCapacidade());
        pst.setInt(3, obj.getIdNave());
      
        
        pst.executeUpdate();    }

    @Override
    public void apagar(Aeronave obj) throws ClassNotFoundException, SQLException {
    Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("DELETE FROM aeropnave" + 
                        "WHERE idnave = ?; ");
        
       pst.setInt(1,obj.getIdNave());
        
        pst.executeUpdate();    }

    @Override
    public Aeronave buscarPelaChave(Integer key) throws ClassNotFoundException, SQLException {
Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("SELECT * FROM aeronave WHERE idnave = ?; ");
        
       pst.setInt(1, key);
        
       Aeronave ae = null;
       
       ResultSet rs = pst.executeQuery();
        
       if(rs.next()){
       ae = new Aeronave((EnumA) rs.getObject("nome"), rs.getInt("capacidade"), rs.getInt("idnave"));
       }
       return ae; 
    }

    @Override
    public ArrayList<Aeronave> buscarTodos() throws ClassNotFoundException, SQLException {
Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("SELECT * FROM aeronave");
        
       ArrayList<Aeronave> lisAe = new ArrayList<>();
       ResultSet rs = pst.executeQuery();
        
       if(rs.next()){
       Aeronave ae;
       ae = new Aeronave((EnumA) rs.getObject("nome"), rs.getInt("capacidade"), rs.getInt("idnave"));
       lisAe.add(ae);
       }
       return lisAe;  
    }

}