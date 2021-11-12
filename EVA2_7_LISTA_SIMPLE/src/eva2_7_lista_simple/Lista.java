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
public class Lista {//Lista simplemente enlazada (Linked List)
    private Nodo inicio;//Acceso a mi lista, punto de partida
    private Nodo fin;
    
    public Lista(){
        inicio = null;//Lista Vacia
        fin = null;
    }
    
    //Agegar nodos
    public void add(Nodo nuevo){
        //Hay nodos en la lista?
        if(inicio == null){//Lista vacia
            inicio = nuevo;//conectamos el primer nodo a la lista
            fin = nuevo;
        }else{//Lista con nodos
            //Hay que movernos al final de la lista
            //Usando TEMP, Nodo por Nodo hasta llegar al final
            Nodo temp = inicio;//aqui empezamos
            //WHILE
            while(temp.getSiguiente() != null){//Mientras TEMP != Null vamos a mover
                temp = temp.getSiguiente();//mover a temp al siguiente nodo
            }
            temp.setSiguiente(nuevo);//conectamos al fnal de la lista al nuevo nodo
        }
    }
    //Imprimir la lista
    public void printList(){
        Nodo temp = inicio;//aqui empezamos
        //WHILE
        while(temp != null){//Mientras TEMP != Null vamos a mover
            System.out.print(temp.getDato() + " - ");
            temp = temp.getSiguiente();//mover a temp al siguiente nodo
            
        }
    }
}
