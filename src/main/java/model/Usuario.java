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
public class Usuario extends Componente{

    public Usuario(String nome, String perfil, String nomeUsuario, String senha, Set<String> autorizacoes, String CPF) {
        super(nome, perfil, nomeUsuario, senha, autorizacoes, CPF);
    }


    public String getNome() {
        return this.nome;
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


    public void setAutorizado(boolean isAutorizado) {
        this.autorizado = isAutorizado;
    }


    public void setAutenticado(boolean isAutenticado) {
        this.autenticado = isAutenticado;
    }
    

    public void add(String autorizacao){
        autorizacoes.add(autorizacao);
    }


    public String getCPF() {
        return CPF;
    }


    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public boolean isAutorizado(){
        return this.autorizado;
    }
    
    public boolean isAutenticado(){
        return this.autenticado;
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Perfil: " + this.perfil + ", Autorizações: " + this.autorizacoes;
    }
    
    
    
}
