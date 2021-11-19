/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8l_lista_doble;

/**
 *
 * @author Admin
 */
public class ListaDoble {
    private Nodo inicio;//Acceso a mi lista, punto de partida
    private Nodo fin;
    private int tama;//contador de nodos

    public ListaDoble() {
        inicio = null;//Lista Vacia
        fin = null;
        tama = 0;
    }
    
    //Agegar nodos
    public void add(int valor){
        Nodo nuevo = new Nodo(valor);
        
        //Hay nodos en la lista?
        if(inicio == null){//Lista vacia
            inicio = nuevo;//conectamos el primer nodo a la lista
            fin = nuevo;
        }else{//Lista con nodos
            //agregar el nodo final a la lista:
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;//Nos movemos al final de la Lista
        }
        tama++;
    }
    
    
    
}
