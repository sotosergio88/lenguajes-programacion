/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.collection;

/**
 *
 * @author Sergio
 */
public class LeerUsuarios {
    public static void main(String[] args)throws Exception{
        //creamos un objeto de la clase Persistencia Usuario
        PersistenciaUsuario p=new PersistenciaUsuario();
        //invocaos el metodo buscarTodos
        System.out.println(p.buscarTodos().size() );
        for(Usuario u:p.buscarTodos()){
            System.err.println("Login"+u.getLogin()+"Password"+u.getPassword());
            
        }
    }
       
    
}
