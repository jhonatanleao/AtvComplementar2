/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import Collection.UsuarioCollection;
import java.util.Set;
import model.Usuario;

/**
 *
 * @author jhonatan
 */
public interface Autorizacao {
    
    public boolean autoriza(Set<String> autorizacoes, String operacao);
}
