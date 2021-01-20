/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.vinicius.projetofliperama.model;

import java.sql.Timestamp;

/**
 *
 * @author Vinícius
 */
public class EmprestimoModel {
    private int idemprestimo;
    private JogoModel jogo;
    private JogadorModel jogador1;
    private Timestamp dtaAluga;
    private Timestamp dtaDevolve;
    
    public int getIdemprestimo() {
        return idemprestimo;
    }

    public void setIdemprestimo(int idemprestimo) {
        this.idemprestimo = idemprestimo;
    }

    public JogoModel getJogo() {
        return jogo;
    }

    public void setJogo(JogoModel jogo) {
        this.jogo = jogo;
    }

    public JogadorModel getJogador1() {
        return jogador1;
    }

    public void setJogador1(JogadorModel jogador1) {
        this.jogador1 = jogador1;
    }

    public Timestamp getDtaAluga() {
        return dtaAluga;
    }

    public void setDtaAluga(Timestamp dtaAluga) {
        this.dtaAluga = dtaAluga;
    }

    public Timestamp getDtaDevolve() {
        return dtaDevolve;
    }

    public void setDtaDevolve(Timestamp dtaDevolve) {
        this.dtaDevolve = dtaDevolve;
    }

    public EmprestimoModel(int idemprestimo, JogoModel jogo, JogadorModel jogador1, Timestamp dtaAluga, Timestamp dtaDevolve) {
        this.idemprestimo = idemprestimo;
        this.jogo = jogo;
        this.jogador1 = jogador1;
        this.dtaAluga = dtaAluga;
        this.dtaDevolve = dtaDevolve;
    }

    public EmprestimoModel() {
        idemprestimo=0;
        jogador1 = new JogadorModel();
        jogo = new JogoModel();
        dtaAluga = new Timestamp(0);
        dtaDevolve = new Timestamp(0);
    }
    
    
}
