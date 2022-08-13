/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Util.GerenciadorDeAutenticacao;
import Util.GerenciadorDeAutorizacao;

/**
 *
 * @author jhonatan
 */
public class ContaCorrenteProxy extends Conta {
    private String numero;
    private GerenciadorDeAutorizacao gerenciadorAutorizacao;
    private ContaCorrente conta;
    private Componente usuario;
    
    @Override
    public void depositar(double valor) {
        if(gerenciadorAutorizacao.autorizaDepositar(usuario.getAutorizacoes())){
            conta.depositar(valor);
            System.out.println("Deposito realizado com sucesso");
        } else {
            System.out.println("Você não tem permissão para realizar depositos");
        }
    }
    
    @Override
    public void receberTransferencia(double valor) {
        if(gerenciadorAutorizacao.autorizaReceberTransferencia(usuario.getAutorizacoes())){
            conta.depositar(valor);
        } else {
            System.out.println("A conta de destino não ṕode receber depositos");
        }
    }

    @Override
    public void sacar(double valor) {
        if(gerenciadorAutorizacao.autorizaSacar(usuario.getAutorizacoes())){
            conta.sacar(valor);
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Você não tem permissão para realizar saques");
        }
    }

    @Override
    public void pagar(double valor) {
        if(gerenciadorAutorizacao.autorizaPagar(usuario.getAutorizacoes())){
            conta.pagar(valor);
            System.out.println("Pagamento realizado com sucesso");
        } else {
            System.out.println("Você não tem permissão para realizar pagamentos");
        }        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(gerenciadorAutorizacao.autorizaTransferir(usuario.getAutorizacoes())){
            conta.transferir(valor, contaDestino);
            System.out.println("Transferencia realizada com sucesso");
        } else {
            System.out.println("Você não tem permissão para realizar transferencias");
        }
    }

    @Override
    public void ativar() {
        if(gerenciadorAutorizacao.autorizaAtivar(usuario.getAutorizacoes())){
            conta.ativar();
            System.out.println("Conta ativada com sucesso");
        } else {
            System.out.println("Você não tem permissão para ativar sua conta. Procure um gerente");
        }  
    }

    @Override
    public void desativar() {
        if(gerenciadorAutorizacao.autorizaDesativar(usuario.getAutorizacoes())){
            conta.desativar();
            System.out.println("Conta desativada com sucesso");
        } else {
            System.out.println("Você não tem permissão para desativar sua conta. Procure um gerente");
        }          
    }

    public double getSaldo(){
        if(gerenciadorAutorizacao.autorizaGetSaldo(usuario.getAutorizacoes())){
            return conta.getSaldo();
        } else {
            System.out.println("Você não tem permissão para ver seu saldo");
            return 0;
        }         
    }
    
    public ContaCorrenteProxy(GerenciadorDeAutorizacao gerenciadorAutorizacao, String numero, Componente usuario) {
        this.gerenciadorAutorizacao = gerenciadorAutorizacao;
        this.usuario = usuario;     
        this.conta = new ContaCorrente(numero, usuario);
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    
    
}
