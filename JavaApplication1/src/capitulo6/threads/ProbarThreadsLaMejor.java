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
public class ProbarThreadsLaMejor {
    //esta es la forma numero 3, LA MEJOR
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable(){
            @Override
            public void run() {
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
        });// clase anonima interna desde el new runnable hasta donde se cierra la 2da llave.
        t1.start();
       
        //clase interna anonima se agrega donde se requiere una referencia dentro
        //de un constructor o un metodo 
        Thread t2=new Thread(new Runnable(){
            @Override
            public void run() {
                while(true){
                try {
                    System.out.println("todos vamos a morir");
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
            }
        });// clase anonima interna desde el new runnable hasta donde se cierra la 2da llave.
        t2.start();
        Thread t3=new Thread(new Runnable(){
            @Override
            public void run() {
                
                
            }
        });// clase anonima interna desde el new runnable hasta donde se cierra la 2da llave.
        t3.start();
        
    }
}
