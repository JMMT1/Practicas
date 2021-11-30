/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_9_queue;

/**
 *
 * @author Admin
 */
public class MyQueue extends Lista {
    //Como la fila del supermercado
    //Los elelmentos se agregan al final de la list
    //Metodo Add de la lista --> sin cambios
    //Solo podemos accder a los elementos al inicio de la lista
    public int peek() throws Exception{//Regresa el valor del elemento al inicio de la lista
        return get(0);
    
    }
    
    public int poll() throws Exception{//Regresa y elimina el elemento al inico de la lista
        //Guardar el valor
        int iVal = get(0);
        //Eliminamos el valor
        deleteAt(0);
        //Enviamos el valor
        return iVal;
        
    }
}    
