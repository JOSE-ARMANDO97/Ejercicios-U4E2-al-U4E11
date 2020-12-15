package Nodo;


public class Nodo {
     public Nodo izquierda;
   public  Nodo Derecha;
     public  int elemento;
    public String texto;
    public Nodo(String texto,int elemento){
    this.texto=texto;   
    this.elemento=elemento;
    this.izquierda=null;
    this.Derecha=null;
    
  }
}
