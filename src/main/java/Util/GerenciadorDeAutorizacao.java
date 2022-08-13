/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.util.Set;

/**
 *
 * @author jhonatan
 */
public class GerenciadorDeAutorizacao {
    
    private Autorizacao MetodoAutorizacao;

    public GerenciadorDeAutorizacao(Autorizacao MetodoAutorizacao) {
        this.MetodoAutorizacao = MetodoAutorizacao;
    }
    
    public boolean autorizaDepositar(Set<String> autorizacoes){
        return MetodoAutorizacao.autoriza(autorizacoes, "depositar");
    }
    
    public boolean autorizaSacar(Set<String> autorizacoes){
        return MetodoAutorizacao.autoriza(autorizacoes, "sacar");
    }
    
    public boolean autorizaPagar(Set<String> autorizacoes){
        return MetodoAutorizacao.autoriza(autorizacoes, "pagar");
    }
    
    public boolean autorizaTransferir(Set<String> autorizacoes){
        return MetodoAutorizacao.autoriza(autorizacoes, "transferir");
    }
    
    public boolean autorizaAtivar(Set<String> autorizacoes){
        return MetodoAutorizacao.autoriza(autorizacoes, "ativar");
    }
    
    public boolean autorizaDesativar(Set<String> autorizacoes){
        return MetodoAutorizacao.autoriza(autorizacoes, "desativar");
    }
    
    public boolean autorizaAtivarQualquerConta(Set<String> autorizacoes){
        return MetodoAutorizacao.autoriza(autorizacoes, "ativaAll");
    }
    
    public boolean autorizaDesativarQualquerConta(Set<String> autorizacoes){
        return MetodoAutorizacao.autoriza(autorizacoes, "desativaAll");
    }
    
    public boolean autorizaGetSaldo(Set<String> autorizacoes){
        return MetodoAutorizacao.autoriza(autorizacoes, "getSaldo");
    }    
    
    public boolean autorizaReceberTransferencia(Set<String> autorizacoes){
        return MetodoAutorizacao.autoriza(autorizacoes, "receberTransferencia");
    }   
}
