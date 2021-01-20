/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.vinicius.projetofliperama.data;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Vinícius
 */
public class Conexao {
    private Connection con;
    public Connection getConexao(){
        return con;
    }
    
    public Conexao() throws Exception{
        String driver="org.postgresql.Driver";
        String url="jdbc:postgresql://localhost:5432/NFliperama";
        Class.forName(driver);
        con = DriverManager.getConnection(url,"postgres","postdba");
    }
}
