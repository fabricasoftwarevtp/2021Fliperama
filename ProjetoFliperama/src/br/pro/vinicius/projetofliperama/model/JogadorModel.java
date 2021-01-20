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
public class JogadorModel {
    private int idjogador;
    private String nome;
    private Timestamp nasc;
    private String email;
    private String rua;
    private int nro_casa;
    private String bairro;

    public int getIdjogador() {
        return idjogador;
    }

    public void setIdjogador(int idjogador) {
        this.idjogador = idjogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Timestamp getNasc() {
        return nasc;
    }

    public void setNasc(Timestamp nasc) {
        this.nasc = nasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public int getNro_casa() {
        return nro_casa;
    }

    public void setNro_casa(int nro_casa) {
        this.nro_casa = nro_casa;
    }
    
        public JogadorModel(int idjogador, String nome, Timestamp nasc, String email, String rua, int nro_casa, String bairro) {
        this.idjogador = idjogador;
        this.nome = nome;
        this.nasc = nasc;
        this.email = email;
        this.rua = rua;
        this.nro_casa = nro_casa;
        this.bairro = bairro;
    }
        
    public JogadorModel(int idjogador,String nome){
        this.idjogador = idjogador;
        this.nome = nome;
    }
    
    public JogadorModel(String nome){
        this.nome = nome;
    }
    
    public JogadorModel(int idjogador){
        this.idjogador = idjogador;
    }

    public JogadorModel() {
        idjogador=0;
        nome = new String();
        nasc = new Timestamp(0);
        email = new String();
        rua = new String();
        nro_casa = 0;
        bairro = new String();
    }
}
