/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.threads;

/**
 *
 * @author Sergio
 */
public class ProbarMisThreads {
    public static void main(String[] args) {
        //ciclo de vida del thread sin contar la pausa 
        //1. creado
        MiPrimerThread t1=new MiPrimerThread();
        //opcionalmente lo bautizamos
        t1.setName("yoyo");
        
        //Inicializado
        t1.start();
        
        //3. En ejecucion cuando corras este programa y se active 
        //su metodo run
        
        
        //5. muerte: cuando complete la tarea que tiene el metodo run
        
    }
}
