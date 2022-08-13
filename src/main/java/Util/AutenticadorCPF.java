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
public class AutenticadorCPF implements Autenticador{

    @Override
    public boolean valida(String nome, String entrada, UsuarioCollection listUsuarios) {
        return listUsuarios.buscaByNameNCPF(nome, entrada);
    }    
}
