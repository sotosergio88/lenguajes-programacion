/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collection;
import java.util.*;
import javax.swing.JRadioButton;
public class GeneradorPreguntas {
    
public static ArrayList<Pregunta>obtenerTodasLasPeguntas(){
    ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
    
    
    
    
    
    //Primero creamos opciones
    Opcion o1p1=new Opcion("Moscu", true);
    Opcion o2p1=new Opcion("Florencia",false);
    Opcion o3p1=new Opcion("Paris",false);
    Opcion o4p1=new Opcion("Londres",false);
    //DEspues generamos un arraylIts de esa opciones y agregamos a dicho arrayList a ellas.
     ArrayList<Opcion> opciones=new ArrayList<Opcion>();
    opciones.add(o1p1);
    opciones.add(o2p1);
    opciones.add(o3p1);
    opciones.add(o4p1); 
    //Desspues creamos la pregunta y en su cosntructor agregamos el titulo y el arrayList de opciones anterior
    Pregunta p1=new Pregunta("Capital de Rusia", opciones);
    
    //Finalmente al arrayList de preguntas agregamos la pregunta
    preguntas.add(p1);
    
    Opcion o1p2=new Opcion("Tokio",false);
    Opcion o2p2=new Opcion("Beiging",true);
    Opcion o3p2=new Opcion("Seul",false);
    Opcion o4p2=new Opcion("Pyongiang",false);
    
    ArrayList<Opcion> opcionesp2=new ArrayList<Opcion>();
    opcionesp2.add(o1p2);
    opcionesp2.add(o2p2);
    opcionesp2.add(o3p2);
    opcionesp2.add(o4p2);
    
    Pregunta p2=new Pregunta("Capital de China", opcionesp2);
    
    preguntas.add(p2);
    
    Opcion o1p3=new Opcion("Berna",true);
    Opcion o2p3=new Opcion("Bélgica",false );
    Opcion o3p3=new Opcion("Brunei",false);
    Opcion o4p3=new Opcion("Burundi",false);
    
    ArrayList<Opcion> opcionesp3=new ArrayList<Opcion>();
    opcionesp3.add(o1p3);
    opcionesp3.add(o2p3);
    opcionesp3.add(o3p3);
    opcionesp3.add(o4p3);
           
    Opcion o1p4=new Opcion("Oman",false);
    Opcion o2p4=new Opcion("Toronto",false );
    Opcion o3p4=new Opcion("Ottawa",true);
    Opcion o4p4=new Opcion("Daca",false);
    
    Pregunta p3=new Pregunta("Cual es la Capital de suiza",opcionesp3);
    
    preguntas.add(p3);
    
    ArrayList<Opcion> opcionesp4=new ArrayList<Opcion>();
    opcionesp4.add(o1p4);
    opcionesp4.add(o2p4);
    opcionesp4.add(o3p4);
    opcionesp4.add(o4p4);
    
    Pregunta p4=new Pregunta("Cual es la Capital de canada",opcionesp4);
      
    preguntas.add(p4);
          
    return preguntas;
      
    }
/**
 * 
 * @param p Proporciona el numero de la pregunta, inicia en cero
 * @param radios proporciona el arreglos de las opciones
 * @return  regresa la respuesta true es correcta false es incorrecta
 */
public static boolean checarRespuesta(Pregunta p, 
        JRadioButton[] radios){
    boolean respuesta=false;
     String seleccion="";
     for(JRadioButton radio:radios){
         if(radio.isSelected()){
           seleccion=  radio.getText();
         }
     }
     
    for(Opcion o:p.getOpciones()){
       if(o.isEstatus()){
           if(o.getTitulo().equals(seleccion))respuesta=true;
       }
    }
    return respuesta;
    
}
    
}
