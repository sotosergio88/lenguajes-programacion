
package Capitulo11.Collections;

/**
 *
 * @author Sergio
 */
public class Opcion {
    private String titulo;
    private boolean estatus;

    public Opcion(String titulo, boolean estatus) {
        this.titulo = titulo;
        this.estatus = estatus;
    }

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
    
}
