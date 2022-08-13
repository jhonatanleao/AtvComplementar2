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
    private Componente usuario;

    public ContaCorrente(String numero, Componente usuario) {
        this.numero = numero;
        this.saldo = 0;
        this.ativa = true;
        this.usuario = usuario;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Componente getUsuario() {
        return usuario;
    }
    
    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    @Override
    public void sacar(double valor){
        if(this.saldo > valor){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    @Override
    public void pagar(double valor){
        if(this.saldo > valor){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(this.saldo > valor){
            this.saldo -= valor;
            contaDestino.receberTransferencia(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }        
        
    }
    
    @Override
    public void ativar(){
        if(this.ativa == true){
            System.out.println("Sua conta já esta ativa");
        } else{
            this.ativa = true;
            System.out.println("Conta ativa com sucesso");
        }
        
    }
    
    @Override
    public void desativar(){
        if(this.ativa == false){
            System.out.println("Sua conta já esta ativa");
        } else{
            this.ativa = true;
            System.out.println("Conta ativa com sucesso");
        }
    }
    
    public boolean isAtiva(){
        return this.ativa;
    }
    
    public void desativarContaUsuario(String numero){
        
    }

}
