/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import Collection.UsuarioCollection;
import model.Usuario;

/**
 *
 * @author jhonatan
 */
public class GerenciadorDeAutenticacao {
    
    private Autenticador autenticador;

    public GerenciadorDeAutenticacao(Autenticador autenticador) {
        this.autenticador = autenticador;
    }    
    
    
    public boolean autentica(String nome, String entrada, UsuarioCollection listUsuarios){
        return autenticador.valida(nome, entrada, listUsuarios);        
    }
      
}
