/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5.excepciones;

/**
 *tarea
 * @author T-101
 */
public class MenorDeEdadException extends Exception{
    
    public MenorDeEdadException() {
        super("no puedo dar de alta a un menor de 18 años");
    }
}
