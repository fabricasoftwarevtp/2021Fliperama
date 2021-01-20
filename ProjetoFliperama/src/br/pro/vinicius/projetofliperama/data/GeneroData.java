/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.vinicius.projetofliperama.data;

import br.pro.vinicius.projetofliperama.model.GeneroModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinícius
 */
public class GeneroData extends Conexao{
    public GeneroData() throws Exception {}
    public boolean incluir(GeneroModel obj) throws Exception{
        String sql ="insert into GENERO (descricao) values (?)";
        PreparedStatement  ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getDescricao());
        return ps.executeUpdate()>0;
    }
    public boolean editar(GeneroModel obj) throws Exception{
        String sql ="update GENERO set descricao=? where idgenero = ?";
        PreparedStatement  ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getDescricao());
        ps.setInt(2,obj.getId());
        return ps.executeUpdate()>0;
    }
    public boolean excluir(int id) throws Exception{
        String sql ="delete from GENERO where idgenero=?";
        PreparedStatement  ps = getConexao().prepareStatement(sql);
        ps.setInt(1,id);
        return ps.executeUpdate()>0;
    }
    public ArrayList<GeneroModel> carregarCombo() throws Exception{
         ArrayList<GeneroModel> dados = new ArrayList<>();
         String sql="Select * from genero order by descricao";
         PreparedStatement ps = getConexao().prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         while(rs.next()){
             GeneroModel obj = new GeneroModel(rs.getInt("idgenero"),rs.getString("descricao"));
             dados.add(obj);
         }  
         return dados;
     }
    
    public ArrayList<GeneroModel> pesquisar(String texto) throws Exception{
        ArrayList<GeneroModel> dados = new ArrayList<>();
        String sql="Select * from genero where descricao ilike '"+texto+"%'";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            GeneroModel obj = new GeneroModel(rs.getInt("idgenero"),rs.getString("descricao"));
            dados.add(obj);
        }   
        return dados;
    }
}
