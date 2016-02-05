/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-101
 */
public class ExcepciontodaviaNoTanMala {
    public static void main(String[] args) {
        //declaramos un arreglo de enteros lo inicializamos (explicita)
        int x[]={4, -20, 12, 0, 13,16,19,43,23,16}; //indicando 4 localidades ya con sus 4 valores ---->>
        //ya sabiendo los valores
        
        float []y=new float[4]; //implicita por 1 solo arreglo. (4localidades
        //con los valores externamente.
        float z;
        //todos los arreglos son ttratados por el compilador como objetos
        
        A objeto=new A();
        //System.out.println(x[3]);//dentro de los corchetes es el indice
        System.out.println(objeto.m);
        System.out.println(y[2]);
        //System.out.println(z); este es primitivo y no le da valor como los arreglos.
        //vamos a iterar el primer arreglo x
        for(int i=0;i<x.length;i++){//este length permite los cambios en el arreglo
            System.out.println(x[i]);
       }
        //el ciclo for para x pero mejorado""
        for(int w:x){
            System.out.println(w);
        }
        
    }
}
class A{
    float m;
}