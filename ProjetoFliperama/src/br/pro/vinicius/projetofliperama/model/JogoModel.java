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
public class JogoModel {
    private int idJogo;
    private String nome;
    private String desenvolvedora;
    private int anoLanc;
    private PlataformaModel plataforma;
    private GeneroModel genero;

    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public int getAnoLanc() {
        return anoLanc;
    }

    public void setAnoLanc(int anoLanc) {
        this.anoLanc = anoLanc;
    }
    
    public PlataformaModel getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(PlataformaModel plataforma) {
        this.plataforma = plataforma;
    }

    public GeneroModel getGenero() {
        return genero;
    }

    public void setGenero(GeneroModel genero) {
        this.genero = genero;
    }

    public JogoModel(int idJogo, String nome, String desenvolvedora, int anoLanc, PlataformaModel plataforma, GeneroModel genero) {
        this.idJogo = idJogo;
        this.nome = nome;
        this.desenvolvedora = desenvolvedora;
        this.anoLanc = anoLanc;
        this.plataforma = plataforma;
        this.genero = genero;
    }

    public JogoModel() {
        idJogo = 0;
        nome = new String();
        desenvolvedora = new String();
        anoLanc = 0;
        plataforma = new PlataformaModel();
        genero = new GeneroModel();
    }
    
    public JogoModel(int idJogo, String nome) {
        this.idJogo = idJogo;
        this.nome = nome;
    }
    
    public JogoModel(String nome) {
        this.nome = nome;
    }
}

