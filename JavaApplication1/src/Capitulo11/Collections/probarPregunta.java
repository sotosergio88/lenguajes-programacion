

package Capitulo11.Collections;

import java.util.ArrayList;

public class probarPregunta {
    public static void main(String[] args) {
        ArrayList<Pregunta> preguntas=GeneradorPreguntas.obtenerTodasLasPreguntas();
        for(Pregunta p:preguntas){
            System.out.println(p.getTitulo());
            for(Opcion o:p.getOpciones()){
                System.out.println(o.getTitulo());
                
            }
        }
        
        
    }
}
