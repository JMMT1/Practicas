/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_garbage_collector;

/**
 *
 * @author Admin
 */
public class Eva1_5_Garbage_Collector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiClase obj = new MiClase();
        System.out.println(obj);//Imprimmos la referencia al objeto en el Heap
        //Eliminamos el objeto
        obj = null;
        System.out.println(obj);
    }
    

}

class MiClase{//Nuevo tipo de dato --> Tipos de datos abstractos 
    String mensaje;//Atributos --> Estado del objeto
    public MiClase(){//Metodos --> Comportamiento 
        mensaje = "Hola mundo";
    }
    
    public String getMensaje(){
        return mensaje;
    }
    public void setMensaje (String mensaje){
        this.mensaje = mensaje;
    }
    
}
