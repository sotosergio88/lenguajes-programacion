/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_final;



import java.util.*;
import javax.swing.JRadioButton;

public class GP {
    public static float aciertos;
    public static ArrayList<Preguntas>obtenerTodasLasPeguntas() {
         ArrayList<Preguntas> preguntas=new ArrayList<Preguntas>();
    
    
    
    
    
    //Primero creamos opciones
    Opciones o1p1=new Opciones("Cualquier entidad en el mundo real", true);
    Opciones o2p1=new Opciones("Cualquier cosa tangible",false);
    Opciones o3p1=new Opciones("Cualquier cosa no fisica",false);
    Opciones o4p1=new Opciones("Cualquier entidad en el mundo informatico",false);
    //DEspues generamos un arraylIts de esa opciones y agregamos a dicho arrayList a ellas.
     ArrayList<Opciones> opc=new ArrayList<Opciones>();
    opc.add(o1p1);
    opc.add(o2p1);
    opc.add(o3p1);
    opc.add(o4p1); 
    //Desspues creamos la pregunta y en su cosntructor agregamos el titulo y el arrayList de opciones anterior
   Preguntas p1=new Preguntas("1. ¿Qué es un objeto en java?", opc);
    
    //Finalmente al arrayList de preguntas agregamos la pregunta
    preguntas.add(p1);
    
       //Primero creamos opciones
    Opciones o1p2=new Opciones("Grupo de objetos qu eno tienen nada que ver entre sí", false);
    Opciones o2p2=new Opciones("Conjunto que hereda solo un atributo",false);
    Opciones o3p2=new Opciones("Conjunto de elementos homogeneos",true);
    Opciones o4p2=new Opciones("Ninguna de las anteriores",false);
    //DEspues generamos un arraylIts de esa opciones y agregamos a dicho arrayList a ellas.
     ArrayList<Opciones> op=new ArrayList<Opciones>();
    op.add(o1p2);
    op.add(o2p2);
    op.add(o3p2);
    op.add(o4p2); 
    //Desspues creamos la pregunta y en su cosntructor agregamos el titulo y el arrayList de opciones anterior
   Preguntas p2=new Preguntas("2. ¿Qué es una clase?", op);
    
    //Finalmente al arrayList de preguntas agregamos la pregunta
    preguntas.add(p2);
    
       //Primero creamos opciones
    Opciones o1p3=new Opciones("Cualquier entidad en el mundo real", false);
    Opciones o2p3=new Opciones("Comportamiento definido en la clase",true);
    Opciones o3p3=new Opciones("Comunicacion entre objetos",false);
    Opciones o4p3=new Opciones("Interaccion entre clases",false);
    //DEspues generamos un arraylIts de esa opciones y agregamos a dicho arrayList a ellas.
     ArrayList<Opciones> o=new ArrayList<Opciones>();
    o.add(o1p3);
    o.add(o2p3);
    o.add(o3p3);
    o.add(o4p3); 
    //Desspues creamos la pregunta y en su cosntructor agregamos el titulo y el arrayList de opciones anterior
   Preguntas p3=new Preguntas("3. ¿Qué es un metodo?", o);
    
    //Finalmente al arrayList de preguntas agregamos la pregunta
    preguntas.add(p3);
    
       //Primero creamos opciones
    Opciones o1p4=new Opciones("Acciones que hace un programa", false);
    Opciones o2p4=new Opciones("Caracteristicas fisicas de un objeto",false);
    Opciones o3p4=new Opciones("Accion que realiza una clase",false);
    Opciones o4p4=new Opciones("Caracteristicas que definen a la clase",true);
    //DEspues generamos un arraylIts de esa opciones y agregamos a dicho arrayList a ellas.
     ArrayList<Opciones> c=new ArrayList<Opciones>();
    c.add(o1p4);
    c.add(o2p4);
    c.add(o3p4);
    c.add(o4p4); 
    //Desspues creamos la pregunta y en su cosntructor agregamos el titulo y el arrayList de opciones anterior
   Preguntas p4=new Preguntas("4. ¿Qué es un atributo?", c);
    
    //Finalmente al arrayList de preguntas agregamos la pregunta
    preguntas.add(p4);
    
        //Primero creamos opciones
    Opciones o1p5=new Opciones("Proiedades decodificadores de mensajes", false);
    Opciones o2p5=new Opciones("Propiedades para enviar mensajes traducidos a distintos objetos",false);
    Opciones o3p5=new Opciones("Propiedades para enviar atributos a una clase",false);
    Opciones o4p5=new Opciones("Propiedad para enviar mensajes simultaneamente iguales a objetos distintos",true);
    //DEspues generamos un arraylIts de esa opciones y agregamos a dicho arrayList a ellas.
     ArrayList<Opciones> ca=new ArrayList<Opciones>();
    ca.add(o1p5);
    ca.add(o2p5);
    ca.add(o3p5);
    ca.add(o4p5); 
    //Desspues creamos la pregunta y en su cosntructor agregamos el titulo y el arrayList de opciones anterior
   Preguntas p5=new Preguntas("5. ¿Qué es polimorfismo?", ca);
    
    //Finalmente al arrayList de preguntas agregamos la pregunta
    preguntas.add(p5);
    
        //Primero creamos opciones
    Opciones o1p6=new Opciones("Descripción detallada de un concepto", false);
    Opciones o2p6=new Opciones("Comprensión de un concepto de manera general sin involucrar el detalle",true);
    Opciones o3p6=new Opciones("Deescripción general y a detalle de un concepto",false);
    Opciones o4p6=new Opciones("Comprensión detallada de un objeto",false);
    //DEspues generamos un arraylIts de esa opciones y agregamos a dicho arrayList a ellas.
     ArrayList<Opciones> d=new ArrayList<Opciones>();
    d.add(o1p6);
    d.add(o2p6);
    d.add(o3p6);
    d.add(o4p6); 
    //Desspues creamos la pregunta y en su cosntructor agregamos el titulo y el arrayList de opciones anterior
   Preguntas p6=new Preguntas("6. ¿Qué es la abstracción?", d);
    
    //Finalmente al arrayList de preguntas agregamos la pregunta
    preguntas.add(p6);
    
    
          //Primero creamos opciones
    Opciones o1p7=new Opciones("Modela programas de diseño grafico", false);
    Opciones o2p7=new Opciones("Modela plantillas basicas del sistema",true);
    Opciones o3p7=new Opciones("Modela plantillas de paginas web en HTML5",false);
    Opciones o4p7=new Opciones("Modela Programas de un sistema obsoleto",false);
    //DEspues generamos un arraylIts de esa opciones y agregamos a dicho arrayList a ellas.
     ArrayList<Opciones> opci=new ArrayList<Opciones>();
    opci.add(o1p7);
    opci.add(o2p7);
    opci.add(o3p7);
    opci.add(o4p7); 
    //Desspues creamos la pregunta y en su cosntructor agregamos el titulo y el arrayList de opciones anterior
   Preguntas p7=new Preguntas("7. ¿Qué modela un Diagrama de clase?", opci);
     
    //Finalmente al arrayList de preguntas agregamos la pregunta
    preguntas.add(p7);
    
          //Primero creamos opciones
    Opciones o1p8=new Opciones("Modela procesos, requerimientos funcionales y no es orientado a objetos", true);
    Opciones o2p8=new Opciones("Modela procedimientos funcionales y es orientado a objetos",false);
    Opciones o3p8=new Opciones("Modela requerimientos funcionales para crear bases de datos",false);
    Opciones o4p8=new Opciones("Modela procesos y es orientados a enventos",false);
    //DEspues generamos un arraylIts de esa opciones y agregamos a dicho arrayList a ellas.
     ArrayList<Opciones> opcio=new ArrayList<Opciones>();
    opcio.add(o1p8);
    opcio.add(o2p8);
    opcio.add(o3p8);
    opcio.add(o4p8); 
    //Desspue creamos la pregunta y en su cosntructor agregamos el titulo y el arrayList de opciones anterior
   Preguntas p8=new Preguntas("8. ¿Qué modela un Caso de Uso?", opcio);
    
    //Finalmente al arrayList de preguntas agregamos la pregunta
    preguntas.add(p8);
    
          //Primero creamos opciones
    Opciones o1p9=new Opciones("Modela plantilla basica del sistema", false);
    Opciones o2p9=new Opciones("Modela comportamiento de sistemas cronologicamente",true);
    Opciones o3p9=new Opciones("Descripción general y a detalle de un concepto",false);
    Opciones o4p9=new Opciones("Describe actividades de un caso de uso",true);
    //DEspues generamos un arraylIts de esa opciones y agregamos a dicho arrayList a ellas.
     ArrayList<Opciones> n=new ArrayList<Opciones>();
    n.add(o1p9);
    n.add(o2p9);
    n.add(o3p9);
    n.add(o4p9); 
    //Desspues creamos la pregunta y en su cosntructor agregamos el titulo y el arrayList de opciones anterior
   Preguntas p9=new Preguntas("9. ¿Qué es un Diagrama de Secuencia?", n);
    
    //Finalmente al arrayList de preguntas agregamos la pregunta
    preguntas.add(p9);
    
    
          //Primero creamos opciones
    Opciones o1p10=new Opciones("Son mutantes", false);
    Opciones o2p10=new Opciones("Arreglo mutable de objetos",true);
    Opciones o3p10=new Opciones("Arreglos delimitados por la cantidad establecida",false);
    Opciones o4p10=new Opciones("Ninguna de las anteriores",false);
    //DEspues generamos un arraylIts de esa opciones y agregamos a dicho arrayList a ellas.
     ArrayList<Opciones> g=new ArrayList<Opciones>();
    g.add(o1p6);
    g.add(o2p6);
    g.add(o3p6);
    g.add(o4p6); 
    //Desspues creamos la pregunta y en su cosntructor agregamos el titulo y el arrayList de opciones anterior
   Preguntas p10=new Preguntas("10. ¿Qué es un arraylist?", g);
    
    //Finalmente al arrayList de preguntas agregamos la pregunta
    preguntas.add(p10);
        
        return preguntas;
    }
      
     public static boolean checarRespuesta(Preguntas p, 
        JRadioButton[] radios){
    boolean respuesta=false;
     String seleccion="";
     for(JRadioButton radio:radios){
         if(radio.isSelected()){
           seleccion=  radio.getText();
         }
     }
     
    for(Opciones o:p.getOpciones()){
       if(o.isEstatus()){
           if(o.getTitulo().equals(seleccion)){
               respuesta=true;
               aciertos++;
           }
           
       }
    }
    return respuesta;
    
}   

    public float getAciertos() {
        return aciertos;
    }

    public void setAciertos(float aciertos) {
        this.aciertos = aciertos;
    }
    
}
