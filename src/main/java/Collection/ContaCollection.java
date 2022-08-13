/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.ArrayList;
import model.ContaCorrenteProxy;

/**
 *
 * @author jhonatan
 */
public class ContaCollection {
    ArrayList<ContaCorrenteProxy> contas = new ArrayList<>();

    public void add(ContaCorrenteProxy conta) {
        this.contas.add(conta);
    }
    
    public ArrayList<ContaCorrenteProxy> getPessoas() {
        return this.contas;
    }
  
    public ContaCorrenteProxy buscaByNumber(String numero){
        for(ContaCorrenteProxy conta : contas){
            if(conta.getNumero().equals(numero)){
                return conta;
            }
        }
        return null;
    }  
}
