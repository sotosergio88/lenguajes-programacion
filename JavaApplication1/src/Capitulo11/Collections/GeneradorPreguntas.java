
package Capitulo11.Collections;


import java.util.*;
import javax.swing.JRadioButton;
public class GeneradorPreguntas {
    
    public static ArrayList<Pregunta>obtenerTodasLasPreguntas(){
        //vamos a crear una sola pregunta con 3 opciones
        Opcion o1=new Opcion("Moscu",true);
        Opcion o2=new Opcion("Paris",false);
        Opcion o3=new Opcion("Florencia",false);
        Opcion o4=new Opcion("Londres",false);
        
        Opcion o1p2=new Opcion("Tokio",false);
        Opcion o2p2=new Opcion("Beijin", true);
        Opcion o3p2=new Opcion("Seul",false);
        Opcion o4p2=new Opcion("Pyonjiang",false);
        
        Opcion op01=new Opcion("Berna",true);
        Opcion op02=new Opcion("Bélgica",false );
        Opcion op03=new Opcion("Brunei",false);
        Opcion op04=new Opcion("Burundi",false);
                
        ArrayList<Opcion> opciones=new ArrayList<Opcion>();
        opciones.add(o1);
        opciones.add(o2);
        opciones.add(o3);
        opciones.add(o4);
        
        ArrayList<Opcion> opcionesp2=new ArrayList<Opcion>();
        opcionesp2.add(o1p2);
        opcionesp2.add(o2p2);
        opcionesp2.add(o3p2);
        opcionesp2.add(o4p2);
        
        ArrayList<Opcion> opcionesp3=new ArrayList<Opcion>();
        opciones.add(op01);
        opciones.add(op02);
        opciones.add(op03);
        opciones.add(op04);
        
        Pregunta p1=new Pregunta("Capital de Rusia",opciones);
        Pregunta p2=new Pregunta("Cual es la Capital de China",opcionesp2);
        Pregunta p3=new Pregunta("Cual es la Capital de suiza",opcionesp3);
        
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        
        return preguntas;
    }
    
    public static boolean checarRespuesta(Pregunta p, JRadioButton[] radios) {
        
        boolean respuesta=false;
        String seleccion="";
        for(JRadioButton radio:radios){
            if(radio.isSelected()){
                seleccion=radio.getText();
            }
        }
    
    }
}
