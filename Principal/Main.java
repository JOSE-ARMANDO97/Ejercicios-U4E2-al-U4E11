package Principal;

import Logica.Procesos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
     public static void main(String args[]) throws Exception{
    Scanner leer = new Scanner(System.in);
        Procesos obj = new Procesos ();
        List lista =new ArrayList();
       boolean continuar = true;
              String nuevo = null;
       int  menu=0,año=0; 
       //PARTE DERECHA
        obj.Insertar("Ana", 1997);
        obj.Insertar("Roberto", 1982);
        obj.Insertar("Cristal", 1993);
        obj.Insertar("Gustavo", 1986);
        obj.Insertar("Martha", 1990);
        obj.Insertar("Fernando", 1981);
        obj.Insertar("Carmen", 1970);
          
          //PARTE IZQUIERDAD
        obj.Insertar("Joseline", 2003);
        obj.Insertar("Alicia", 2009);
        obj.Insertar("Cesar", 2005);
        obj.Insertar("Ramiro", 2001);
         obj.Insertar("Lalo", 2002);
        
    
        while(continuar){
    
        System.out.println("\n ****DATOS INGRASADOS*********  \n"
                   + " ********OPERACIONES CON ARBOL BINARIO******** "+"\n"
                   + "0:INSERTAR NUEVO REGISTRO"+"\n"
                   + "1: ¿QUIEN ES LA PERSONA MAS PEQUEÑAS Y QUE EDAD TIENE ?\n"
                   + "2: ¿QUIEN ES LA PERSONA  MAS GRANDE Y QUE EDAD TIENE? \n"
                   + "3: ¿CUANTOS AÑOS DE DIFERENCIA TIENEN LA PERSONA MAS GRANDE Y LA PERSONA MAS CHICA? \n"
                   + "4: ¿CUANTOS PARTICIPANTES HAY? "+"\n"
                   + "5: ¿CUANTOS ES LA SUMA DE LAS EDADES DE LOS PARTICIPANTES?  "+"\n"
                   + "6: ¿CUAL ES EL PROMEDIO DE LOS PARTICIPANTES?"+" \n"
                   + "7: ¿MOSTRAR LA ALTURA"+"\n"
                   + "8: ¿MOSTRAR EN PRE-ORDEN"+"\n"
                   + "9: ¿MOSTRAR EN IN-ORDEN? "+"\n"
                   + "10:¿MOSTRAR EN POST-ORDEN"+"\n"
                   + "11: SALIR");
        menu=leer.nextInt();
        
          switch(menu){
              case 0:  
                      System.out.println("INGRESE NOMBRE DEL LA PERSONA");
                      nuevo=leer.next();
                      System.out.println("INGRESE EL AÑO DENACIMIENTO");
                      año=leer.nextInt();
                      obj.Insertar(nuevo, año);
                break;
                case 1: 
                obj.EdadMenor();
               break;
            case 2: 
                obj.EdadMayor();
               break;
            case 3:
                System.out.println("******************************************************");
                System.out.println("LA DIFERENCIA DE ES:["+obj.diferencias()+"]");
                 System.out.println("******************************************************");
              
                break;
            case 4:
                 System.out.println("******************************************************");
                System.out.println("EL TOTAL DE PARTICIPANTE ES:["+obj.cantidad()+"]");
                 System.out.println("******************************************************");
                break;
            case 5: 
               System.out.println("******************************************************");
               System.out.println("LA SUMA TOTAL DE EDADES ES: ["+obj.Suma()+"]");
               System.out.println("******************************************************");  
                break;
                case 6:
                  
                  System.out.println("******************************************************");
                  System.out.println("EL PROMEDIO ES TOTAL DE EDADES ES:["+obj.promedio(obj.nodoRaiz)+"]");
                  System.out.println("******************************************************");
     
                break;
                 case 7:
                    System.out.println("******************************************************");
                    System.out.println(" LA ALTURA DEL ARBOL ES: ["+obj.ImprimirAltura(obj.nodoRaiz,1)+"]");
                    System.out.println("******************************************************");
                break;
                case 8:
                    System.out.println("******************************************************");
                   obj.recorridoPre_orden(obj.nodoRaiz);System.out.println();
                    System.out.println("******************************************************");
                break;
                case 9:
                    System.out.println("******************************************************");
                obj.recorridoIn_orden(obj.nodoRaiz);System.out.println();
                    System.out.println("******************************************************");
                break;
                case 10:
                    System.out.println("******************************************************");
                obj.recorridoPost_orden(obj.nodoRaiz);System.out.println();
                    System.out.println("******************************************************");
                break;
                case 11:
               System.out.println("fuera");
                    continuar =false;
                break;
                 default:
                 System.out.println("");
                 break;
           
          }
     }
  }
}

