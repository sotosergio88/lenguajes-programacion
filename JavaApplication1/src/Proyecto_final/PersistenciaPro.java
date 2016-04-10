/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_final;
//probar_persistencia


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Sergio
 */
public class PersistenciaPro {
    public static void main(String[] args)throws Exception{
       Usus u1=new Usus();
                u1.setLogin("tu");
                u1.setPassword("5678");
            //Ahora usaremos la clase Persistencia usuario para persistir(guardar) a este usuario
            PersistenciaPro p=new PersistenciaPro();
             p.guardar (u1);
             System.out.println("Usus gurdado con exito");
        
    }
    
     ArrayList<Usus> usuarios;

     //creamos un costructor sin seleccionar nada der los ususarios
    public PersistenciaPro() {
        usuarios=new ArrayList<>();
    }
  //primero ponemos el metodo de buscar todo
    //el ArrayList es como una tabla grandota para los usuarios
  ArrayList<Usus>  buscarTodos()throws Exception{
        //paso numero 1: leemos el archivo donde estan guardado el ArrayList 
        File f=new File("Archivaldo.raton");
        //leemos el contenido
        FileInputStream fis=new FileInputStream(f);
        //Descomprimimos el contenido 
        ObjectInputStream ois=new ObjectInputStream(fis);
     usuarios=(ArrayList<Usus>) ois.readObject();
        return usuarios;
     
    }
    public void guardar(Usus u) throws Exception{
        File f=new File("Archivaldo.raton");
        if(f.exists())usuarios=buscarTodos();
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
    }

    
}
