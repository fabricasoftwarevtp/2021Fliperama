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
public class UsuarioModel {
    private String login;
    private String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public UsuarioModel(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public UsuarioModel() {
        login = new String();
        senha = new String();
    }

    
    
}
