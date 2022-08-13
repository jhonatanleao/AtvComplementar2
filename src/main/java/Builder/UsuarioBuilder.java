/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

import model.Componente;

/**
 *
 * @author jhonatan
 */
public abstract class UsuarioBuilder {
    
    protected Componente usuario;
    
    public abstract void addAutorizacao();
    
    public final Componente getUsuario(){
        return usuario;
    }
    
}
