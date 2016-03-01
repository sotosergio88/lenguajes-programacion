/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo.ete;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

/**
 *
 * @author Sergio
 */
public class GenerarClientes {
   public static Cliente[] obtenerClientes(){
       
         Cliente Clientes[] = new Cliente[3];
         
        Clientes[0]=new Cliente("Ana","lopez",20,20000,new Direccion("sur 10",20,"ecatepec"));
        Clientes[1]=new Cliente("Pedro","Martinez",45,14000,new Direccion("Mexico",122,"ecatepec"));
        Clientes[2]=new Cliente("Ana","lopez",20,20000,new Direccion("sur 10",20,"ecatepec"));
      
                
                
           
    return Clientes;
    
   }  
}
