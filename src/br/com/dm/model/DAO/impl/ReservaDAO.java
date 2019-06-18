/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dm.model.DAO.impl;


import br.com.dm.model.Assento;
import br.com.dm.model.DAO.GenericDAO;
import br.com.dm.model.Reserva;
import br.com.dm.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Flávio
 */
public class ReservaDAO implements GenericDAO<Reserva, Integer>{

    @Override
    public void inserir(Reserva obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("INSERT INTO reserva " 
                +"(nome, idCliente, idVoo, idLocalidade, data, destino, idReserva) VALUES"
                + "(?,?,?,?, ?, ?, ?);");
        
        pst.setString(1, obj.getNome());
        pst.setInt(2, obj.getIdCliente());
        pst.setInt(3, obj.getIdVoo());
        pst.setInt(4, obj.getIdLocalidade());
        pst.setDate(5, (Date) obj.getData());
        pst.setString(6, obj.getDestino());
        pst.setInt(7, obj.getIdReserva());
        
        
        pst.executeUpdate();
    }

    @Override
    public void alterar(Reserva obj) throws ClassNotFoundException, SQLException {
Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("UPDATE reserva SET " 
                        + "( nome = ?, idCliente = ?, idVoo = ?, idLocalidade = ?, data = ?, destino = ?, idReserva = ?"
                        + " WHERE idReserva = ? )"); 
        
        pst.setString(1, obj.getNome());
        pst.setInt(2, obj.getIdCliente());
        pst.setInt(3, obj.getIdVoo());
        pst.setInt(4, obj.getIdLocalidade());
        pst.setDate(5, (Date) obj.getData());
        pst.setString(6, obj.getDestino());
        pst.setInt(7, obj.getIdReserva());
        
        
        pst.executeUpdate();
    }

    @Override
    public void apagar(Reserva obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("DELETE FROM reserva" + 
                        "WHERE idReserva = ?; ");
        
       pst.setInt(1,obj.getIdReserva());
        
        pst.executeUpdate();
    }

    @Override
    public Reserva buscarPelaChave(Integer key) throws ClassNotFoundException, SQLException {
Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("SELECT * FROM reserva WHERE idReserva = ?; ");
        
       pst.setInt(1, key);
        
       Reserva res = null;
       
       ResultSet rs = pst.executeQuery();
        
       /*
       if(rs.next()){
       res = new Reserva
       (rs.getString("nome"),
       rs.getString("cpf"),rs.getInt("idCliente"),
       rs.getInt("idVoo"),rs.getInt("idLocalidade"),rs.getString("destino"),
       rs.getInt("idReserva"),rs.getDate("Data"),
       rs.getDouble("Hora"), (ArrayList<Assento>) rs.getArray("Assentos"));
            }
       */
       
       return res;
    }

    @Override
    public ArrayList<Reserva> buscarTodos() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("SELECT * FROM reserva");
        
       ArrayList<Reserva> lisRes = new ArrayList<>();
       ResultSet rs = pst.executeQuery();
        
       /*
       if(rs.next()){
       Reserva  res =  new Reserva
               
       (rs.getString("nome"),
       rs.getString("cpf"),rs.getInt("idCliente"),
       rs.getInt("idVoo"),rs.getInt("idLocalidade"),rs.getString("destino"),
       rs.getInt("idReserva"),rs.getDate("Data"),
       rs.getDouble("Hora"), (ArrayList<Assento>) rs.getArray("Assentos"));
       lisRes.add(res);
       }*/
       return lisRes;
    }  
}

