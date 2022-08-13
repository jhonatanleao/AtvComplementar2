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
public final class Diretor {
    
    public Componente build(UsuarioBuilder builder){
        builder.addAutorizacao();
        
        return builder.getUsuario();
    }
}
