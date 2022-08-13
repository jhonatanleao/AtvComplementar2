/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Set;

/**
 *
 * @author jhonatan
 */
public class Usuario {
    private String nome;
    private String perfil;
    private String nomeUsuario;
    private String senha;
    private boolean autorizado;
    private boolean autenticado;
    private Set<String> autorizacoes;

    public Usuario(String nome, String perfil, String nomeUsuario, String senha) {
        this.nome = nome;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public Set<String> getAutorizacoes() {
        return autorizacoes;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    void setAutorizado(boolean isAutorizado) {
        this.autorizado = isAutorizado;
    }

    void setAutenticado(boolean isAutenticado) {
        this.autenticado = isAutenticado;
    }
    
    void add(String autorizacao){
        autorizacoes.add(autorizacao);
    }
    
    
}
