
package Solucion.Examen;

/**
 *outliers libro comprarlo...
 * @author Sergio plaaaannnaaa
 */
public class ValidarOpcion {
    public  void validar (Opcion[]opciones)throws SoloUnaCorrectaException{
        int soloUna=0;
        for(Opcion o:opciones){
            if(o.isEstatus()){
                soloUna++;
                if(soloUna>1)throw new SoloUnaCorrectaException();
             
                
            }
        }
        
    }
}
