/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.vinicius.projetofliperama.data;
import br.pro.vinicius.projetofliperama.model.JogadorModel;
import br.pro.vinicius.projetofliperama.model.TelefoneModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinícius
 */
public class TelefoneData extends Conexao{
    public TelefoneData() throws Exception{}
    public boolean incluir(TelefoneModel obj) throws Exception{
        String sql="Insert into jogadortelefone (idjogador,telefone) "
                + "values (?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, obj.getJogador().getIdjogador());
        ps.setString(2, obj.getTelefone());

        return ps.executeUpdate()>0;
    }
    
    public boolean excluir(int idtelefone) throws Exception {
        String sql="delete from telefone where idtelefone=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,idtelefone);
        return ps.executeUpdate()>0; 
    }
    
    public boolean editar(TelefoneModel obj) throws Exception {
        String sql="update jogadortelefone set (idjogador,telefone) = (?,?) where idtelefone=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, obj.getJogador().getIdjogador());
        ps.setString(2,obj.getTelefone());
        ps.setInt(3,obj.getIdtelefone());
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<TelefoneModel> pesquisar(String texto) throws Exception{
        ArrayList<TelefoneModel> dados = new ArrayList<>();
        String[] palavras = texto.split(" ");
        String sql = "select jt.idtelefone, j.nome as nomejogador, jt.telefone from jogadortelefone jt "
                + "inner join jogador as j on jt.idjogador = j.idjogador where ";
        for(int i=0;i<palavras.length;i++) {
            if(i>0 && i!= palavras.length) sql+= " or ";
            sql+= "j.nome ilike '%"+palavras[i]+"%'";
        }
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            TelefoneModel obj = new TelefoneModel(
                    rs.getInt("idtelefone"),
                    new JogadorModel(rs.getString("nomejogador")), 
                    rs.getString("telefone")); 
            dados.add(obj);
        }
        
        return dados;
    }
}
