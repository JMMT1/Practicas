package eva2_7_lista_simple;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Nodo {
    private int dato;
    private Nodo siguiente;//Referencia
    //constructores
    public Nodo(){//default
        this.siguiente = null;
    }
    public Nodo (int dato){
        this.dato = dato;
        this.siguiente = null;
    }
    //get y set
    public int getDato() {
        return dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
