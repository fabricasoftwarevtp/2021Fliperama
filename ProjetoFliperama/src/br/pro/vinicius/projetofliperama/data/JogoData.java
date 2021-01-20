/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.vinicius.projetofliperama.data;

import br.pro.vinicius.projetofliperama.model.JogoModel;
import br.pro.vinicius.projetofliperama.model.PlataformaModel;
import br.pro.vinicius.projetofliperama.model.GeneroModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinícius
 */
public class JogoData extends Conexao{
    public JogoData() throws Exception{}
    public boolean incluir(JogoModel obj) throws Exception{
        String sql="Insert into jogo (nome,desenvolvedora,anoLanc,idplataforma,idgenero) "
                + "values (?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getNome());
        ps.setString(2, obj.getDesenvolvedora());
        ps.setInt(3,obj.getAnoLanc());
        ps.setInt(4, obj.getPlataforma().getId());
        ps.setInt(5,obj.getGenero().getId());
        return ps.executeUpdate()>0;
    
    }
    
    public boolean editar(JogoModel obj) throws Exception {
        String sql="update jogo set (nome,desenvolvedora,anoLanc,idplataforma,idgenero) = (?,?,?,?,?) where idjogo=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getNome());
        ps.setString(2, obj.getDesenvolvedora());
        ps.setInt(3,obj.getAnoLanc());
        ps.setInt(4, obj.getPlataforma().getId());
        ps.setInt(5,obj.getGenero().getId());
        ps.setInt(6,obj.getIdJogo());
        return ps.executeUpdate()>0;
    }
    
    public boolean excluir(int idjogo) throws Exception {
        String sql="delete from jogo where idjogo=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,idjogo);
        return ps.executeUpdate()>0; 
    }
    
    public ArrayList<JogoModel> pesquisar(String texto) throws Exception{
        ArrayList<JogoModel> dados = new ArrayList<>();
        String[] palavras = texto.split(" ");
        String sql = "select j.idjogo,j.nome,j.desenvolvedora,j.anolanc,p.descricao as descricaoplataforma, g.descricao as descricaogenero from jogo j "
                + "inner Join plataforma as p on j.idplataforma=p.idplataforma "
                + "inner join genero as g on j.idgenero=g.idgenero where";
        for(int i=0;i<palavras.length;i++) {
            if(i>0 && i!= palavras.length) sql+= " or ";
            sql+= " nome ilike '%"+palavras[i]+"%' or desenvolvedora ilike '%"+palavras[i]+"%' or g.descricao ilike '%"+palavras[i]+"%' or p.descricao ilike '%"+palavras[i]+"%'";
        }
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            JogoModel obj = new JogoModel(rs.getInt("idjogo"), 
                    rs.getString("nome"), 
                    rs.getString("desenvolvedora"), 
                    rs.getInt("anoLanc"),  
                    new PlataformaModel(rs.getString("descricaoplataforma")),
                    new GeneroModel(rs.getString("descricaogenero")));
            dados.add(obj);
        }
        
        return dados;
    }
    
    public ArrayList<JogoModel> carregarCombo() throws Exception{
         ArrayList<JogoModel> dados = new ArrayList<>();
         String sql="Select * from jogo order by nome";
         PreparedStatement ps = getConexao().prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         while(rs.next()){
             JogoModel obj = new JogoModel(rs.getInt("idjogo"),rs.getString("nome"));
             dados.add(obj);
         }  
         return dados;
     }
}