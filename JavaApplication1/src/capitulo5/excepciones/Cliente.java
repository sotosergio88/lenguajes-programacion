/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5.excepciones;


public class Cliente {
    private String email;
    private int edad;//al final del renglor insert code -- constructor
/**
 *  
 * @param email
 * @param edad 
 */
    public Cliente(String email, int edad) {
        this.email = email;
        this.edad = edad;
    }

    public Cliente() {
    }

    /**
     * Este metodo nos regresa el mail que ya previamente
     * se debio haber proporcionado por el metodo set correspondiente
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * este metodo necesita que proporciones un String
     * que va a ser el mail que le va a asignar al cliente
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) throws ValorNoNegativoException, MenorDeEdadException {
   
        ValidarEdad.checarEdadNegativa(edad);
        ValidarEdad.checarMenorEdad( edad);
        
        this.edad=edad;
    }
    
}

