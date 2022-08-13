/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.ArrayList;
import model.Componente;

/**
 *
 * @author jhonatan
 */
public class UsuarioCollection {
    ArrayList<Componente> usuarios = new ArrayList<>();

    public void addPessoa(Componente usuario) {
        this.usuarios.add(usuario);
    }
    
    public ArrayList<Componente> getPessoas() {
        return this.usuarios;
    }
  
    public boolean buscaByNameNCPF(String nome, String CPF){
        for(Componente usuario : usuarios){
            if(usuario.getNomeUsuario().equals(nome)){
                if(usuario.getCPF().equals(CPF))
                    return true;
            }
        }
        return false;
    }
    
    public boolean buscaByNameNPassword(String nome, String password){
        for(Componente usuario : usuarios){
            if(usuario.getNomeUsuario().equals(nome)){
                if(usuario.getSenha().equals(password))
                    return true;
            }
        }
        return false;        
    }
}
