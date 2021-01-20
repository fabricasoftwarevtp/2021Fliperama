/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.vinicius.projetofliperama.model;

/**
 *
 * @author Vinícius
 */
public class TelefoneModel{
    
    private int idtelefone;
    private JogadorModel jogador;
    private String telefone;

    public JogadorModel getJogador() {
        return jogador;
    }

    public void setJogador(JogadorModel jogador) {
        this.jogador = jogador;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdtelefone() {
        return idtelefone;
    }

    public void setIdtelefone(int idtelefone) {
        this.idtelefone = idtelefone;
    }

    public TelefoneModel(int idtelefone, JogadorModel jogador, String telefone) {
        this.idtelefone = idtelefone;
        this.jogador = jogador;
        this.telefone = telefone;
    }

    public TelefoneModel() {
        idtelefone = 0;
        jogador = new JogadorModel();
        telefone = new String();
    }

    
}
