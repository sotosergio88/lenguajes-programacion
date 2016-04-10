/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_final;
import java.util.*;

public class Preguntas {
    private String titulo;
     private ArrayList<Opciones> opciones; 

    public Preguntas(String titulo, ArrayList<Opciones> opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Opciones> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opciones> opciones) {
        this.opciones = opciones;
    }

   
    
}
