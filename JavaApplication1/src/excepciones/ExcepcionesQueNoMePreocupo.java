/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * a estas excepciones se les cponoce como 
 * inchecked exceptions
 * @author T-101
 */
public class ExcepcionesQueNoMePreocupo {
    public static void main(String[] args) {
        //una excepcion y sus trampas
        int a=2;
        int b=0;
        //si cambio los valores a flotante se crea la exception uncheked y 
        //es corresta
        System.out.println("Antes de la Excepcion");
       int z=a/b;
        System.out.println("el valo de la division es: ("+z+")");
     }
}
