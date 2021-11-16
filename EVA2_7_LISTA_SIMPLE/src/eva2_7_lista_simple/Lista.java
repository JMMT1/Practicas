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
            /*Nodo temp = inicio;//aqui empezamos
            //WHILE
            while(temp.getSiguiente() != null){//Mientras TEMP != Null vamos a mover
                temp = temp.getSiguiente();//mover a temp al siguiente nodo
            }
            temp.setSiguiente(nuevo);//conectamos al fnal de la lista al nuevo nodo*/
            //agregar el nodo final a la lista:
            fin.setSiguiente(nuevo);
            fin = nuevo;//Nos movemos al final de la Lista
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
    //Borrar la Lista
    public void clear(){//borramos tdos los nodos de la lista
        inicio = null;
        fin = null;
    }
    //Contar los Nodos:
    public int length(){
        int iCont = 0;
        Nodo temp = inicio;//aqui empezamos
        //WHILE
        while(temp != null){
            iCont++;
            temp = temp.getSiguiente();//mover a temp al siguiente nodo
        }
        return iCont;
    }
    
    //La Lita esta vacia: True, con Nodos: False
    public boolean isEmpty(){
        if(inicio == null)
            return true;
        else
            return false;
    
    }
    //Recuperar un valor de la lista:
    public int get(int pos) throws Exception{
        //Verificacion
        if(isEmpty()){//Lista este vacia
            throw new Exception("No hay valores almacenados en la lista!!");
        }else{ //Posicion que no exista: posicion negativa o que nos pasemos
            //pos tiene que estar entre cero y N-1
            if ((pos < 0) || (pos >= length()))//si pos es meno a cero o pos es mayor igual a N
                throw new Exception("El valor " + pos + " no es una posicion valida en la lista!!");
        }
        
        Nodo temp = inicio;
        for (int i = 0; i < pos; i++) {
            temp = temp.getSiguiente();//mover a temp al siguiente nodo
        }
        return temp.getDato();
    }
    
}
