/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collection;

import java.util.ArrayList;

/**
 *
 * @author campitos
 */
public class ProbarPreguntas {
    public static void main(String[] args) {
        ArrayList<Pregunta> preguntas=
                GeneradorPreguntas.obtenerTodasLasPeguntas();
        
        for(Pregunta p:preguntas){
            System.out.println(p.getTitulo());
            for(Opcion o:p.getOpciones()){
                System.out.println(o.getTitulo());
            }
        }
    }
    
}
