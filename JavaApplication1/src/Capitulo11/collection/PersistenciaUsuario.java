/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * persistencia tiene que ver con base de datos 
 */
package Capitulo11.collection;

import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Sergio
 */
public class PersistenciaUsuario {
     ArrayList<Usuario> usuarios;

     //creamos un costructor sin seleccionar nada der los ususarios
    public PersistenciaUsuario() {
        usuarios=new ArrayList<>();
    }
  //primero ponemos el metodo de buscar todo
    //el ArrayList es como una tabla grandota para los usuarios
  ArrayList<Usuario>  buscarTodos()throws Exception{
        //paso numero 1: leemos el archivo donde estan guardado el ArrayList 
        File f=new File("Archivaldo.raton");
        //leemos el contenido
        FileInputStream fis=new FileInputStream(f);
        //Descomprimimos el contenido 
        ObjectInputStream ois=new ObjectInputStream(fis);
     usuarios=(ArrayList<Usuario>) ois.readObject();
        return usuarios;
     
    }
    public void guardar(Usuario u) throws Exception{
        File f=new File("Archivaldo.raton");
        if(f.exists())usuarios=buscarTodos();
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
    }
    
}
