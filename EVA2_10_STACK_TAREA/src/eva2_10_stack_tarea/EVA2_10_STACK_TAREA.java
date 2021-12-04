/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_stack_tarea;

import java.util.Stack;

/**
 *
 * @author Admin
 */
public class EVA2_10_STACK_TAREA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Filo first-in , last-out
        Stack pila = new Stack();
        pila.push(50);      //Indice de 0
        pila.push("String");//Indice de 1
        pila.push(17);
        pila.push("Palabra");
        //solo se puede obtener ultimo valor
        //peek para ver, y el metodo pop para obtener
        
        System.out.println("El ultimo elemento en la pila es: " + pila.peek());
        
        while(pila.empty()==false)
        {
            System.out.println(pila.pop());
        }
        
    }
    
}
