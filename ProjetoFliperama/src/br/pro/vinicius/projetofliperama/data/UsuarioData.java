/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.vinicius.projetofliperama.data;

import br.pro.vinicius.projetofliperama.model.UsuarioModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Vinícius
 */
public class UsuarioData extends Conexao{
    public UsuarioData() throws Exception {}
    public boolean incluir(UsuarioModel obj) throws Exception {
        String sql="insert into usuario (login,senha) values (?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getLogin());
        ps.setString(2,obj.getSenha());
        return ps.executeUpdate()>0;
    }
    
    public boolean editar(UsuarioModel obj) throws Exception{
        String sql ="update usuario set senha=? where login = ?";
        PreparedStatement  ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getSenha());
        ps.setString(2,obj.getLogin());
        return ps.executeUpdate()>0;
    }
    
    public UsuarioModel validarUsuario(String login, String senha) throws Exception{
        String sql = "select * from usuario where login = ? and senha = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,login);
        ps.setString(2,senha);
        ResultSet rs = ps.executeQuery();
            UsuarioModel obj = null;
        if(rs.next()){
            obj = new UsuarioModel(rs.getString("login"), rs.getString("senha"));
        }
        return obj;
    }
    
    
}
