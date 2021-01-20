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
public class GeneroModel {
    private int id;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public GeneroModel(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
        public GeneroModel(String descricao2) {
        this.descricao = descricao2;
    }

    public GeneroModel() {
        id = 0;
        descricao = new String();
    }
    
    
    
}
