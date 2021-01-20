/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.vinicius.projetofliperama.data;

import br.pro.vinicius.projetofliperama.model.JogadorModel;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinícius
 */
public class JogadorData extends Conexao{
    public JogadorData() throws Exception {}
    public boolean incluir(JogadorModel obj) throws Exception{
        String sql ="insert into jogador (nome,dtaNasc,email,rua,nro_casa,bairro)"
                + "values (?,?,?,?,?,?)";
        PreparedStatement  ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getNome());
        ps.setTimestamp(2,obj.getNasc());
        ps.setString(3,obj.getEmail());
        ps.setString(4,obj.getRua());
        ps.setInt(5,obj.getNro_casa());
        ps.setString(6,obj.getBairro());
        return ps.executeUpdate()>0;
    }
    public boolean editar(JogadorModel obj) throws Exception{
        String sql ="update jogador set nome = ?, dtaNasc = ?, email = ?, rua = ?, nro_casa = ?, bairro = ? where idjogador = ?";
        PreparedStatement  ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getNome());
        ps.setTimestamp(2,obj.getNasc());
        ps.setString(3,obj.getEmail());
        ps.setString(4,obj.getRua());
        ps.setInt(5,obj.getNro_casa());
        ps.setString(6,obj.getBairro());
        ps.setInt(7,obj.getIdjogador());
        return ps.executeUpdate()>0;
    }
    public boolean excluir(int IdJogador) throws Exception{
        String sql ="delete from jogador where idjogador=?";
        PreparedStatement  ps = getConexao().prepareStatement(sql);
        ps.setInt(1,IdJogador);
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<JogadorModel> pesquisar(String texto) throws Exception{
        ArrayList<JogadorModel> dados = new ArrayList<>();
        String sql="Select * from jogador where nome ilike '"+texto+"%'";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            JogadorModel obj = new JogadorModel(rs.getInt("idjogador"),rs.getString("nome"),rs.getTimestamp("dtaNasc"),rs.getString("email"),rs.getString("rua"),rs.getInt("nro_casa"),rs.getString("bairro"));
            dados.add(obj);
        }   
        return dados;
    }
    
    public ArrayList<JogadorModel> carregarCombo() throws Exception{
         ArrayList<JogadorModel> dados = new ArrayList<>();
         String sql="Select * from jogador order by nome";
         PreparedStatement ps = getConexao().prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         while(rs.next()){
             JogadorModel obj = new JogadorModel(rs.getInt("idjogador"),rs.getString("nome"));
             dados.add(obj);
         }  
         return dados;
     }
    
    
}
