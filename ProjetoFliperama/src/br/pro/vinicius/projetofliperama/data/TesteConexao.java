/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.vinicius.projetofliperama.data;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinícius
 */
public class TesteConexao {
    public static void main(String[] args) {
        try {
            Conexao c = new Conexao();
            JOptionPane.showMessageDialog(null, "Deu certo!!!");

    //pesquisar("Java 8 como oi teste iui");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Deu erro:"+e);

        }
    }
    /*public static void pesquisar(String texto) throws Exception{
    String[] palavras = texto.split(" ");
        String sql = "Select * from obras where ";
        for(int i=0;i<palavras.length;i++) {
            if(i>0 && i!= palavras.length) sql+= " or ";
            sql+= " descricao like '"+palavras[i]+"%' ";
        }
        System.out.println(sql);
    }*/
}
