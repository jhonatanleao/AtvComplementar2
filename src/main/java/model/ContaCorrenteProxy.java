/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Util.GerenciadorDeSeguranca;

/**
 *
 * @author jhonatan
 */
public class ContaCorrenteProxy implements IContaCorrente {
    private GerenciadorDeSeguranca gerenciadorSeguranca;
    private ContaCorrente conta;
    private Usuario usuario;
    
    @Override
    public void depositar(double valor) {
        if(gerenciadorSeguranca.autorizaDebitar(usuario)){
            conta.depositar(valor);
        } else {
            System.out.println("não foi possivel realizar a operação de debitar");
        }
    }

    @Override
    public void sacar(double valor) {
        if(gerenciadorSeguranca.autorizaCreditar(usuario)){
            conta.sacar(valor);
        } else {
            System.out.println("não foi possivel realizar a operação de creditar");
        }
    }

    @Override
    public void pagar(double valor) {
        
    }

    @Override
    public void transferir(double valor, IContaCorrente contaDestino) {

    }

    @Override
    public void ativar() {

    }

    @Override
    public void desativar() {
        
    }

    public ContaCorrenteProxy(GerenciadorDeSeguranca gerenciadorSeguranca, ContaCorrente conta, Usuario usuario) {
        this.gerenciadorSeguranca = gerenciadorSeguranca;
        this.conta = conta;
        this.usuario = usuario;
    }


    
}
