/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import model.Usuario;

/**
 *
 * @author jhonatan
 */
public class AutenticadorDeSenha implements Autenticador{

    @Override
    public boolean valida(Usuario usuario, String entrada) {
        return usuario.getSenha() == entrada;
    }


    
    
    
}
