/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author jhonatan
 */
public interface IContaCorrente{
    
    public void depositar(double valor);
    public void sacar(double valor);
    public void pagar(double valor);
    public void transferir(double valor, IContaCorrente contaDestino);
    public void ativar();
    public void desativar();
}
