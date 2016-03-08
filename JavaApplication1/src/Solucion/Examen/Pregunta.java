/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solucion.Examen;

/**
 *
 * @author Sergio
 */
public class Pregunta {
  private  String titulo;
  private Opcion opcion[];

    public Pregunta(String titulo, Opcion[] opcion) {
        this.titulo = titulo;
        this.opcion = opcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Opcion[] getOpcion() {
        return opcion;
    }

    public void setOpcion(Opcion[] opcion) {
        this.opcion = opcion;
    }
    
}
