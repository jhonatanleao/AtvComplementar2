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
public abstract class Componente {
    protected String nome;
    protected String perfil;
    protected String nomeUsuario;
    protected String senha;
    protected boolean autorizado;
    protected boolean autenticado;
    protected Set<String> autorizacoes;
    protected String CPF;

    public Componente(String nome, String perfil, String nomeUsuario, String senha, Set<String> autorizacoes, String CPF) {
        this.nome = nome;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.autorizado = false;
        this.autenticado = false;
        this.autorizacoes = autorizacoes;
        this.CPF = CPF;
    }

    public String getNome(){
        return this.nome;
    }

    public String getPerfil(){
        return this.perfil;
    }

    public String getNomeUsuario(){
        return this.nomeUsuario;
    }

    public String getSenha(){
        return this.senha;
    }

    public Set<String> getAutorizacoes(){
        return this.autorizacoes;
    }

    public  void setPerfil(String perfil){
        
    }

    public void setAutorizado(boolean isAutorizado){
        
    }

    public void setAutenticado(boolean isAutenticado){
        
    }
    
    public void add(String autorizacao){
        
    }

    public String getCPF(){
        return this.CPF;
    }

    public void setCPF(String CPF){
        
    }
    
}
