/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dm.model.DAO.impl;

import br.com.dm.model.Cliente;
import br.com.dm.model.DAO.GenericDAO;
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
public class ClienteDAO implements GenericDAO<Cliente, Integer> {

    
    @Override
    public void inserir(Cliente obj) throws ClassNotFoundException, SQLException {
    Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("INSERT INTO cliente "
                + "(nome,cpf,datanasc,idCliente) VALUES (?,?,?,?)");
        
        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getCpf());
        pst.setString(3,  obj.getIdade());
        pst.setInt(4, obj.getIdCliente());
        
        
        pst.executeUpdate();
    }

    @Override
    public void alterar(Cliente obj) throws ClassNotFoundException, SQLException {
   Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("UPDATE cliente SET " 
                        + "( nome = ?, cpf = ?, datanasc = ? WHERE idbilhete = ? )");
        
        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getCpf());
        pst.setString(3, obj.getIdade());
        pst.setInt(4, obj.getIdCliente());
        
        pst.executeUpdate();
    }

    @Override
    public void apagar(Cliente obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("DELETE FROM Cliente" + 
                        "WHERE idCliente = ?; ");
        
       pst.setInt(1,obj.getIdCliente());
        
        pst.executeUpdate();
    }

    @Override
    public Cliente buscarPelaChave(Integer key) throws ClassNotFoundException, SQLException {
Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("SELECT * FROM Cliente WHERE idCliente = ?; ");
        
       pst.setInt(1, key);
        
       Cliente cli;
        cli = null;
       
       ResultSet rs = pst.executeQuery();
        
       if(rs.next()){
       Cliente cl = new Cliente(rs.getString("nome"),
            rs.getString("cpf"),
            rs.getInt("idCliente"),
            rs.getString("datanasc"),
            rs.getString("sexo"),
            rs.getString("estadocivil"));
       }
       return cli;
    }    

    @Override
    public ArrayList<Cliente> buscarTodos() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        PreparedStatement pst = c.prepareStatement("SELECT * FROM Cliente");
        
       ArrayList<Cliente> lisCli = new ArrayList<>();
       ResultSet rs = pst.executeQuery();
        
       while(rs.next()){
       Cliente cli = new Cliente(rs.getString("nome"),
       rs.getString("cpf"),
       rs.getInt("idCliente"),
       rs.getString("datanasc"),
       rs.getString("sexo"),
       rs.getString("estadocivil"));
       
       lisCli.add(cli);
       }
       return lisCli; 
    }

    public ArrayList<Cliente> buscarPeloNome(String nome) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        try {
            String sql = "SELECT * FROM cliente where nome like ?;";

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, "%"+nome+"%");
            
            ResultSet rs = ps.executeQuery();
            ArrayList<Cliente> listCli = new ArrayList<>();
            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setIdCliente(rs.getInt("idcliente"));
                cli.setNome(rs.getString("nome"));
                cli.setCpf(rs.getString("cpf"));
                listCli.add(cli);
            } 
            return listCli;
    
    }finally{
     c.close();
    }
  }
}
