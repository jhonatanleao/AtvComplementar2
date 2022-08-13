/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jhonatan
 */
public abstract class Conta {

    
    public void depositar(double valor){
        
    }
    public void sacar(double valor){
        
    }
    public abstract void pagar(double valor);
    public void transferir(double valor, Conta contaDestino){
        
    }
    public abstract void ativar();
    public abstract void desativar();
    
    public void receberTransferencia(double valor) {

    }
    
}
