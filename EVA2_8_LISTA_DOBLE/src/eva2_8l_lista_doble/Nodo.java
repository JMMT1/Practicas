package eva2_8l_lista_doble;

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
    private Nodo previo;
    
    //constructores
    public Nodo(){//default
        this.siguiente = null;
        this.previo = null;
    }
    public Nodo (int dato){
        this.dato = dato;
        this.siguiente = null;
        this.previo = null;
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

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
     
}
