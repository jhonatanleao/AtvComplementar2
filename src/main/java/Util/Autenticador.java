/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Util;

import Collection.UsuarioCollection;
import model.Usuario;

/**
 *
 * @author jhonatan
 */
public interface Autenticador {
    
    public boolean valida(String nome, String entrada, UsuarioCollection listUsuarios);
}
