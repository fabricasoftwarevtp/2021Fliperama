/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.vinicius.projetofliperama.data;

import br.pro.vinicius.projetofliperama.model.EmprestimoModel;
import br.pro.vinicius.projetofliperama.model.JogadorModel;
import br.pro.vinicius.projetofliperama.model.JogoModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Vinícius
 */
public class EmprestimoData extends Conexao{   
    public EmprestimoData() throws Exception{}
    public boolean incluir(EmprestimoModel obj) throws Exception{
        String sql="Insert into emprestimo (idjogador,idjogo,dtaaluga,dtadevolve)"
                + "values (?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, obj.getJogador1().getIdjogador());
        ps.setInt(2,obj.getJogo().getIdJogo());
        ps.setTimestamp(3,obj.getDtaAluga());
        ps.setTimestamp(4,obj.getDtaDevolve());
        return ps.executeUpdate()>0;
    
    }
    
    public boolean editar(EmprestimoModel obj) throws Exception {
        String sql="update emprestimo set (idjogador,idjogo,dtaaluga,dtadevolve) = (?,?,?,?) where idemprestimo=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, obj.getJogador1().getIdjogador());
        ps.setInt(2, obj.getJogo().getIdJogo());
        ps.setTimestamp(3,obj.getDtaAluga());
        ps.setTimestamp(4, obj.getDtaDevolve());
        ps.setInt(5,obj.getIdemprestimo());
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<EmprestimoModel> pesquisar(String texto) throws Exception{
        ArrayList<EmprestimoModel> dados = new ArrayList<>();
        String[] palavras = texto.split(" ");
        String sql = "select idemprestimo, j.nome as nomejogador, jg.nome as nomejogo,e.dtaaluga,e.dtadevolve from emprestimo e"
                + " inner Join jogo as jg on e.idjogo=jg.idjogo "
                + "inner join jogador as j on e.idjogador=j.idjogador where";
        for(int i=0;i<palavras.length;i++) {
            if(i>0 && i!= palavras.length) sql+= " or ";
            sql+= " j.nome ilike '%"+palavras[i]+"%' or jg.nome ilike '%"+palavras[i]+"%'";
        }
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            EmprestimoModel obj = new EmprestimoModel(
                    rs.getInt("idemprestimo"),  
                    new JogoModel(rs.getString("nomejogo")),
                    new JogadorModel(rs.getString("nomejogador")),
                    rs.getTimestamp("dtaaluga"), 
                    rs.getTimestamp("dtadevolve"));
            dados.add(obj);
        }
        
        return dados;
    }
}
