/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_lista_simple;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class EVA2_7_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear una Lista
        Lista miLista = new Lista();
        /*int[] miArreglo = new int [1000000];
        for (int i = 0; i < miArreglo.length; i++) {
            miArreglo[i] = (int)(Math.random() * 1000);
        }
        for (int i = 0; i < 1000000; i++) {
            miLista.add(new Nodo(1));
        }*/  
        miLista.add(new Nodo(100));
        miLista.add(new Nodo(200));
        miLista.add(new Nodo(300));
        miLista.add(new Nodo(400));
        miLista.add(new Nodo(500));
        miLista.printList();
        System.out.println("Cantidad de nodos: " + miLista.length());
        
        try {
            System.out.println("Posicion: " + miLista.get(10));
        } catch (Exception ex) {//Aqui se resuelve el error
            ex.printStackTrace();//Imprime el error
        }
        //Seguir con el programa
        System.out.println("El programa continua");
    }
    
}
