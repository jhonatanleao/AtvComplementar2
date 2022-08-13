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

    public abstract String getNome();

    public abstract String getPerfil();

    public abstract String getNomeUsuario();

    public abstract String getSenha();

    public abstract Set<String> getAutorizacoes();

    public abstract void setPerfil(String perfil);

    public abstract void setAutorizado(boolean isAutorizado);

    public abstract void setAutenticado(boolean isAutenticado);
    
    public abstract void add(String autorizacao);

    public abstract String getCPF();

    public abstract void setCPF(String CPF);
    
}
