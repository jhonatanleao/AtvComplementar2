/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jhonatan
 */
class ContaCorrente extends Conta {
    private String numero;
    private double saldo;
    private boolean ativa;
    private Usuario usuario;

    public ContaCorrente(String numero, double saldo, boolean ativa, Usuario usuario) {
        this.numero = numero;
        this.saldo = saldo;
        this.ativa = ativa;
        this.usuario = usuario;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    @Override
    public void sacar(double valor){
        this.saldo -= valor;
    }
    
    @Override
    public void pagar(double valor){
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        contaDestino.depositar(valor);
    }
    
    @Override
    public void ativar(){
        this.ativa = true;
    }
    
    @Override
    public void desativar(){
        this.ativa = false;
    }
    
    public boolean isAtiva(){
        return this.ativa;
    }
    
    private void verificaAtiva(){
        
    }

}
