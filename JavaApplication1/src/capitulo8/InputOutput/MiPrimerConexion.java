/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo8.InputOutput;

import java.net.*;
import java.io.*;




public class MiPrimerConexion {
    public static void main(String[] args) throws Exception{
        //primero vamos a usar una clase que se llama URL
        URL url=new URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
        //ahora tipo de conexion
        HttpURLConnection con=(HttpURLConnection) url.openConnection();
        //obtiene los datos
        InputStream input=con.getInputStream();
        InputStreamReader isr=new InputStreamReader (input);
        //lee renglon por renglon
        BufferedReader reader=new BufferedReader(isr);
        int renglones=0;
        
        /**
         * boolean encontrado=false;
         * String temperaturas[]=new String[5];
         * while (reader.readLine() !=null){
         * String renglonActual=reader.readLine();
         * if(renglonActual.contains("Outside Temp")){
         * encontrado=true;
         * System.out.println("si existe este renglon");
         *}
         */
        
        //while(reader.readLine() !=null){
         //renglones++;
         //para impirmir solamente 2 renglones
        if(reader.readLine().contains("Current Conditions as of")){
            System.out.println("");
         
         //para que imprima el cpodigo de la pagina 
            //System.out.println(reader.readLine("Current Conditions as of"));
        }
         String hola="<td width=class summary_data>21.1 C</td>";
         int indice1= hola.indexOf("summary_data");
         int indice2= hola.indexOf("</td>");
         String nuevo=hola.substring(indice1+13, indice2);
            System.out.println(nuevo);
        }
   // String hola="<td width=class summary_timestamp></td>";
     //    int indice3= hola.indexOf("summary_timestamp");
       //  int indice4= hola.indexOf("</td>");
         //String nuevo1=hola.substring(indice3+13, indice4);
           // System.out.println(nuevo1);
       //System.out.println("Número de renglones: "+renglones);
}

            
    

