/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dm.model.DAO.impl;


import br.com.dm.model.DAO.GenericDAO;
import br.com.dm.model.Localidade;
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
public class LocalidadeDAO implements GenericDAO<Localidade, Integer> {

    @Override
    public void inserir(Localidade obj) throws ClassNotFoundException, SQLException {
Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("INSERT INTO localidade " 
                +"(idlocalidade, pais, estado, cidade) VALUES"
                + "(?,?,?,?);");
        pst.setInt(1, obj.getIdlocalidade());
        pst.setString(2, obj.getPais());
        pst.setString(3, obj.getEstado());
        pst.setString(4, obj.getCidade());
        
        
        pst.executeUpdate();
    }

    @Override
    public void alterar(Localidade obj) throws ClassNotFoundException, SQLException {
 Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement(
        "UPDATE localidade SET  idlocalidade = ?,  pais = ?,  estado = ?,  cidade = ?, WHERE idlocalidade = ?, ");
        
        pst.setString(1, obj.getPais());
        pst.setString(2, obj.getEstado());
        pst.setString(3, obj.getCidade());
        pst.setInt(4,obj.getIdlocalidade());
        
        pst.executeUpdate();
    }

    @Override
    public void apagar(Localidade obj) throws ClassNotFoundException, SQLException {
 Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("DELETE FROM localidade" + 
                        "WHERE idlocalidade = ?; ");
        
       pst.setInt(1,obj.getIdlocalidade());
        
        pst.executeUpdate();
    }

    @Override
    public Localidade buscarPelaChave(Integer key) throws ClassNotFoundException, SQLException {
Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("SELECT * FROM localidade WHERE idlocalidade = ?; ");
        
       pst.setInt(1, key);
        
       Localidade loc = null;
       
       ResultSet rs = pst.executeQuery();
        
       if(rs.next()){
       loc = new Localidade(rs.getString("pais"),rs.getString("cidade") ,rs.getString("estado"), rs.getInt("idlocalidade"));
       }
       return loc;
    }

    @Override
    public ArrayList<Localidade> buscarTodos() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("SELECT * FROM localidade");
        
       ArrayList<Localidade> lisLoc = new ArrayList<>();
       ResultSet rs = pst.executeQuery();
        
       while(rs.next()){
       Localidade loc = new Localidade(rs.getString("pais"),
       rs.getString("cidade") ,
       rs.getString("estado"),
       rs.getInt("idlocalidade"));
       lisLoc.add(loc);
       }
       return lisLoc;
    }
   
   }     
