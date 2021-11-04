/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_nodos;

/**
 *
 * @author Admin
 */
public class Eva2_6_Nodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo inicio = new Nodo();
        inicio.datos = 100;
        inicio.referencia = new Nodo();
        inicio.referencia.datos = 200;
        inicio.referencia.referencia = null;
        System.out.println(inicio);
        System.out.println(inicio.referencia);
    }
}

class Nodo{
    int datos;//Datos (aqui guardamos la informacion) 
    Nodo referencia;//Referencia: nos permite enlazar nodos, y crear cadenas(listas)
    
}
