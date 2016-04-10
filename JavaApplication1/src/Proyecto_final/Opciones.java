/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto_final;

/**
 *
 * @author Sergio
 */
public class Opciones {
    String  titulo;
   boolean estatus;  

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public Opciones(String titulo, boolean estatus) {
        this.titulo = titulo;
        this.estatus = estatus;
    }
   
}
