/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_final;
import java.util.*;
/**
 *Probar pregunta
 * @author Sergio
 */
public class Pp {
     public static void main(String[] args) {
        ArrayList<Preguntas> preguntas=
                GP.obtenerTodasLasPeguntas();
        
        for(Preguntas p:preguntas){
            System.out.println(p.getTitulo());
            for(Opciones o:p.getOpciones()){
                System.out.println(o.getTitulo());
            }
        }
    }
    
}
