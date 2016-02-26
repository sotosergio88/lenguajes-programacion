/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergio
 */
public class ProbarMisThreads implements Runnable{
    public static void main(String[] args) {
        //ciclo de vida del thread sin contar la pausa 
        //1. creado
        MiPrimerThread t1=new MiPrimerThread();
        //otro thread  ---estos dos renglones creean un thread
        Runnable r=new ProbarMisThreads();
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        
        //el thread t2 tiene que hacer que se imprima del 1 al 10 con espacio de 
        //5 segundos entre impresion
        //el thread t3 tiene que hacer que se implrima la frase todos
        //"vamos a morir" hasta el final de los timpos
        //cada segundo  ---el metodo runnable es lo que van a compartir los metodos
        
                
        //opcionalmente lo bautizamos
        t1.setName("yoyo");
        t2.setName("taco");
        t3.setName("tico");
        //Inicializado
        t1.start();
        t2.start();
        t3.start();
        
        //3. En ejecucion cuando corras este programa y se active 
        //su metodo run
                
        //5. muerte: cuando complete la tarea que tiene el metodo run
        
    }

    @Override
    public void run() {
        //primero preguntamos si es el thread t2 y si es que imprima del 1 al 10
        if(Thread.currentThread().getName().equals("taco")){
           int x=0;
           for(int i=0;i<5000000; i++){
               System.out.println(x++);
               try {
                   Thread.sleep(5000);
               } catch (InterruptedException ex) {
                   Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
        }
        if(Thread.currentThread().getName().equals("tico")){
            while(true){
                try {
                    System.out.println("todos vamos a morir");
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
