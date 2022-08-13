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

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getPerfil() {
        return perfil;
    }

    @Override
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    @Override
    public String getSenha() {
        return senha;
    }

    @Override
    public Set<String> getAutorizacoes() {
        return autorizacoes;
    }

    @Override
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public void setAutorizado(boolean isAutorizado) {
        this.autorizado = isAutorizado;
    }

    @Override
    public void setAutenticado(boolean isAutenticado) {
        this.autenticado = isAutenticado;
    }
    
    @Override
    public void add(String autorizacao){
        autorizacoes.add(autorizacao);
    }

    @Override
    public String getCPF() {
        return CPF;
    }

    @Override
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
    
}
