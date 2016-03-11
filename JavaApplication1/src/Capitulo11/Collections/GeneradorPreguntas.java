
package Capitulo11.Collections;


import java.util.*;
public class GeneradorPreguntas {
    
    public static ArrayList<Pregunta>obtenerTodasLasPreguntas(){
        //vamos a crear una sola pregunta con 3 opciones
        Opcion o1=new Opcion("Moscu",true);
        Opcion o2=new Opcion("Paris",false);
        Opcion o3=new Opcion("Florencia",false);
        
        ArrayList<Opcion> opciones=new ArrayList<Opcion>();
        opciones.add(o1);
        opciones.add(o2);
        opciones.add(o3);
        
        Pregunta p1=new Pregunta("Capital de Rusia",opciones);
        
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        preguntas.add(p1);
        
        return preguntas;
    }
}
