/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo8.InputOutput;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Sergio
 */
public class ServicioLeerEstacion {
    public static String generarValor (String etiqueta)throws Exception{
        
        String valor="sin valor";
        URL url=new URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
        //ahora tipo de conexion
        HttpURLConnection con=(HttpURLConnection) url.openConnection();
        //obtiene los datos
        InputStream input=con.getInputStream();
        InputStreamReader isr=new InputStreamReader (input);
        //lee renglon por renglon
        BufferedReader reader=new BufferedReader(isr);
        //siguiente linea para ayudarnos a depurar.
        String lineaActual="No ha leido nada";
        //int renglones=0;
        boolean encontrado=false;
        int miLinea=0;
        //si marca error es por el orden de precedencia y solo veia el null.
         while((lineaActual=reader.readLine()) !=null){
             if(encontrado &&miLinea<=0){
                 //vamos a despedazar la linea
                 int indice= lineaActual.indexOf(">");
                 int indice2= lineaActual.indexOf("</");
                 String tempActual=lineaActual.substring(indice+1, indice2);
                 valor=tempActual;
                 System.out.println(tempActual); 
                 miLinea++;
             }           
             if(lineaActual.contains(etiqueta))
                encontrado=true;
                
                //System.out.println("Dato encontrado!!!");
                
         }  
    return valor;
    }
    
}


    

