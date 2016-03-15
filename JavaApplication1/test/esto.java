/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio
 */
public class esto {
 
piucl class main()
{

   //variables para el caso 0
   float rad = 0.0, seno = 0.0, coseno = 0.0 ;


   //variables para el inciso 1
      int conta = 1 ;

       
   int opcionusuario = 0 ;
   int z = 1 ;

   cout << "0) TRIGONOMETRICAS " << endl;
   cout << "1) EN LISTA DE 20(HASTA 100)" << endl;
   cout << "2) EN COLUMNAS (CORTO) " << endl;
   cout << "3) POR COLUMNAS (BLOQUES) CORRIDO "  << endl;
   cout << "4) POR COLUMNAS (BLOQUES) PREGUNTANDO " << endl;
   cout << "5) ELECCIONES " << endl;
   cout << "6) SALIR      " << endl;
   cout << "seleccione opcion : " ;
   cin  >> opcionusuario ;

   switch (opcionusuario)
       {

	  case 0 :
	      {
	       for (int beta = 0 ; beta <= 364 ; beta+=5)
                   {
                     rad = beta * (3.14156 / 180) ; // hacemos la conv. a radianes 
		     seno = sin(rad) ; //obtenemos el seno del ang. convertido a rad.
                     coseno = cos(rad);
		     cout <<"El seno   de " << beta << " grados es : " << seno << endl ;
		     cout <<"El coseno de " << beta << " grados es : " << coseno <<endl ;
                     cout << endl;
                    } // fin for
               cout << "ya terminamos este inciso del seno ";
               break;  
	      }


          

	  case 1 :
	      {
	       for (int f = 1 ; f <= 100 ; f++)
                   {

                     if (conta < 20)
                        { cout << f << " Holita" << endl ;
                          conta++ ;
                        }
                     else
                        { 
                          conta = 0 ;
			  cout << f << " Holita" << endl;
			  cout << "ENTER PARA CONTINUAR....."  ;
			  getch();
			  clrscr();
			  conta++;
                        }

                    } // fin for
	       cout << "ya terminamos este inicso ";
               break;  
	      }


     /*--------------------------------------------------------------------------------------*/

	  case 2:
	     {
		   for (int w = 1 ; w <= 14; w++)
                        {
                          if ( w % 2 == 0)
	                    {
	                      cout << z << " HOLOTA    " << w << " HOLOTA" ;
	                      z = w + 1 ;
                            }
                         cout << endl;  // aqui creamos el renglon nuevo 
                        }


                   if (w % 2 == 0 )
                       {
	                cout << z << " HOLOTA    "  << endl ;
		   cout << "ya terminamos este inicIso ";    }

               break;
	     }

      /* --------------------------------------------------------------------------------------*/
	  case 3:
	    {
		
              for (int w = 1 ; w <= 213; w++)
                {
                  if (conta < 20)
	             if ( w % 2 == 0)
	                {
			    cout << z << "  ¿ QUE HAY ?    " << w << "  ¿ QUE HAY ? " ;
	                    z = w + 1 ;
                            conta++;
	                }
	             else
                        { 
		          cout << endl;  // aqui creamos el renglon nuevo
	            	}
                  else
	             {
	               conta = 0 ;
	               // cout << w << " holaa " ;
	               cout << endl;
	               cout << "oprime enter para continuar ......."  ;
	               getch();
	               clrscr();
	               // conta++;
                      }

                }

               if (w % 2 == 0 )
                  {
		    cout << z << " ¿ QUE HAY ?    "  << endl ;
                  }

	       cout << "ya terminamos este inciso ";
             break ;
	    }


       /*-----------------------------------------------------------------------------------------------*/
	  case 4:
	     {
		char opc = '  ' ;
                for (int w = 1 ; w <= 314; w++)
                { 
                  if (conta < 20)
	               if ( w % 2 == 0)
	                   {
	                     cout << z << " HOLA    " << w << " HOLA" ;
	                     z = w + 1 ;
                             conta++;
	                   }    
	               else
                           { 
	                       cout << endl;  // aqui creamos el renglon nuevo
	                   }
                  else
	             {
	                conta = 0 ;
	                cout << endl;
	                cout << "Quieres continuar ? s / n ......."  ;
	                cin >> opc ;
	               if (opc == 'n')
	             	  {
	                    cout << "hemos terminado";
                            w = w + 4000 ; 
                          }
	               else
                          {
	                   getch();
	                   clrscr(); }
	      
                     }

                }
   
                 if (w % 2 == 0 && opc == 's' )
                     {
                     	  cout << z << " HOLA...    "  << endl ;

                     }
	       cout << "ya terminamos este inciso 4";
              break;
	     } // fin del case 4

     /*---------------------------------------------------------------------------------------------------*/
	   case 5 :
		{

		   int votos_pri=  0 , votos_pan = 0 , votos_prd = 0 , votos_panal = 0,
		       votos_nulo = 0, voto = 0, votos_otros = 0   ;
     

                  for( int eleccion = 1 ; eleccion < 10 ; eleccion++)
                      {

                       cout << " 1) PRI    2) PRD   3) PAN   4) PANAL   5) NULO  " << endl;
                       cin >> voto ; 
                       if (voto == 1)
	                  {
	                   votos_pri++ ;
	                   }
                       else
	                  if (voto == 2)
	                     {
	                       votos_prd++;
                             }
	                  else
	                    if (voto == 3)
	                       {
		                votos_pan++;
		               }
	                    else
	                       if (voto == 4)
		                  {
	                	     votos_panal++;
	                          }
	                       else
		                  {
		                   votos_nulo++;
		                  }
		       }  /// fin for

                       votos_otros = votos_prd + votos_pan + votos_panal ;
		       if ( (votos_pri > votos_prd && votos_pri > votos_pan && votos_pri > votos_panal ) )
			    {
                             cout << "le ganador es el PRI con : " << votos_pri ;
                            }
		       else
			  if (votos_otros > votos_pri)
			     {
			      votos_pri = votos_otros ;
                              cout << "el ganador es el PRI con : " << votos_pri ;
			     }
			  else
			     if (votos_otros == votos_pri)
				{
                                 votos_pri = votos_pri+= 10 ; 
				}
			     else
				{
                                 cout << "gana el pri " << endl;
                                }
                 break ;
                }
    /*----------------------------------------------------------------------------------------------------------*/

	  case 6 :
		{
		 cout << "Grcias por usar nuestro software " << endl;
                 break;

		}

	  default :
	     {

	     }


       } // fin switch

  cout << endl;
  cout << "SE HATERMINADO LA PRESENTACION !!!!!!!! " ;
 
  getch();
  return 0;

}



}
