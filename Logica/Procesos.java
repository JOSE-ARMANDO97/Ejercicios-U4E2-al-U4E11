package Logica;

import Nodo.Nodo;


public class Procesos {
    
     int altura ,suma,difeMayor,difeMenor;
     float promedio;
    int CantiadadNodos,Diferencia,cont=0;
   public  Nodo nodoRaiz;
   public Nodo nodoPadre;
 
    public Procesos(){
  
    this.altura=0;
    this.nodoPadre=null;
    this.nodoRaiz=null;
    this.promedio=0;
    this.suma=0;
    }
    
    public void Insertar (String texto,int año){
        Nodo nodoActual = new Nodo(texto,año);
        if(nodoPadre ==null){
            nodoPadre= nodoActual;
            nodoRaiz=nodoActual;   
        }else {
            
        if(nodoActual.elemento  <  nodoPadre.elemento){
           if(nodoPadre.izquierda==null){
           nodoPadre.izquierda=nodoActual;
           nodoPadre=nodoRaiz;
           }else{
                   nodoPadre = nodoPadre.izquierda;
                   Insertar(texto,año);
                
           }    
                }else{
                   if(nodoPadre.Derecha==null){
                       nodoPadre.Derecha = nodoActual;
                    nodoPadre=nodoRaiz;
                   }else{
                   nodoPadre = nodoPadre.Derecha;
                   Insertar(texto,año);
                
                   }
              }
        }
      
    }

    
    public void recorridoIn_orden(Nodo reco) {
        if (reco != null) {
            recorridoIn_orden (reco.izquierda); 
            System.out.print("|"+reco.texto+"  "+reco.elemento+" | ");
            recorridoIn_orden (reco.Derecha);
        } 
    }
    
   public void recorridoPost_orden (Nodo reco) {
        if (reco != null) {
            recorridoPost_orden (reco.izquierda); 
            recorridoPost_orden (reco.Derecha);
            System.out.print("|"+reco.texto+"  "+reco.elemento+ " | ");
        } 
    }
   
   
   public void recorridoPre_orden (Nodo reco) {
        if (reco != null) {
            System.out.print("|"+reco.texto+" "+ reco.elemento + "| ");
            recorridoPre_orden (reco.izquierda); 
            recorridoPre_orden (reco.Derecha);
            
        } 
   }
   public int ImprimirAltura (Nodo reco,int nivel) {
        if (reco != null) {
            ImprimirAltura (reco.izquierda,nivel+1);
            if (nivel>altura) altura=nivel;
            ImprimirAltura (reco.Derecha,nivel+1);
        } 
      return altura;
    } 
 
   
   
    private void Suma(Nodo reco){
    if (reco != null) {
       
        Suma(reco.izquierda); 
        Suma(reco.Derecha);
        
            suma+=(2020-reco.elemento);
        }
    }
     public int Suma(){
         suma=0;
     Suma(nodoRaiz);
        
         return suma;
    
    
    }
      public float promedio(Nodo reco){
if (reco != null) { 
      
            promedio=(Suma()/cantidad());
        }
         return  promedio;
   }
   private void cantidad(Nodo reco) { 
        if (reco!=null) { 
            CantiadadNodos++; cantidad(reco.izquierda); cantidad(reco.Derecha); 
        } 
    } 
   
   
    public int cantidad() { 
        CantiadadNodos=0; cantidad(nodoRaiz); 
        return CantiadadNodos;
   }
    
    
    public void EdadMenor() { if (nodoRaiz!=null) { 
        Nodo reco=nodoRaiz; 
    while (reco.Derecha!=null) 
        reco=reco.Derecha;
    System.out.println("LA PERSONA MAS MENOR ES :"+reco.texto+"  CON UNA EDAD DE:  " +(2020-reco.elemento)); 
    difeMenor=(2020-reco.elemento);
    }
  } 
    
    
    public void EdadMayor() { if (nodoRaiz!=null) { 
        Nodo reco=nodoRaiz; 
    while (reco.izquierda!=null) 
        reco=reco.izquierda;
    System.out.println("LA PERSONA MAS MAYOR ES : "+reco.texto+"  CON UNA EDAD DE:  "+(2020-reco.elemento));
    difeMayor=(2020-reco.elemento);
    }
  } 
    
    public int diferencias(){
       Diferencia= (difeMayor-difeMenor);
         return Diferencia;
 }
}
