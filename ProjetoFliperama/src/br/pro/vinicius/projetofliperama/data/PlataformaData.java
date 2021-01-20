/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.vinicius.projetofliperama.data;

import br.pro.vinicius.projetofliperama.model.PlataformaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinícius
 */
public class PlataformaData extends Conexao{
public PlataformaData() throws Exception {}
    public boolean incluir(PlataformaModel obj) throws Exception {
        String sql="insert into plataforma (descricao) values (?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getDescricao());
        return ps.executeUpdate()>0;
    }
    public boolean editar(PlataformaModel obj) throws Exception {
        String sql="update plataforma set descricao=? where idplataforma=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getDescricao());
        ps.setInt(2,obj.getId());
        return ps.executeUpdate()>0;
    }
    public boolean excluir(int id) throws Exception {
        String sql="delete from plataforma where idplataforma=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,id);
        return ps.executeUpdate()>0;
    }
    public ArrayList<PlataformaModel> pesquisar(String texto) throws Exception{
        ArrayList<PlataformaModel> dados = new ArrayList<>();
        String sql="Select * from plataforma where descricao ilike '"+texto+"%'";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            PlataformaModel obj = new PlataformaModel(rs.getInt("idplataforma"),rs.getString("descricao"));
            dados.add(obj);
        }   
        return dados;
    }
    public ArrayList<PlataformaModel> carregarCombo() throws Exception{
         ArrayList<PlataformaModel> dados = new ArrayList<>();
         String sql="Select * from plataforma order by descricao";
         PreparedStatement ps = getConexao().prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         while(rs.next()){
             PlataformaModel obj = new PlataformaModel(rs.getInt("idplataforma"),rs.getString("descricao"));
             dados.add(obj);
         }  
         return dados;
     }
    
}
