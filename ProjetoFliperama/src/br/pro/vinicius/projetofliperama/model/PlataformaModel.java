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
public class PlataformaModel {
    private int idplataforma;
    private String descricao;

    public int getId() {
        return idplataforma;
    }

    public void setId(int id) {
        this.idplataforma = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public PlataformaModel(int id, String descricao) {
        this.idplataforma = id;
        this.descricao = descricao;
    }
    
    public PlataformaModel(String descricao) {
        this.descricao = descricao;
    }

    public PlataformaModel() {
        idplataforma = 0;
        descricao = new String();
    }
    
    
    
}
